package com.hzh.com.hzhcom.zkplock;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;


public class ZkReentrantLockTest {


    public void testTry() throws InterruptedException {
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(10000, 3);
        CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:2181", retryPolicy);
        client.start();

        final ZkDistributedLockTemplate template=new ZkDistributedLockTemplate(client);
        int size=100;
        final CountDownLatch startCountDownLatch = new CountDownLatch(1);
        final CountDownLatch endDownLatch=new CountDownLatch(size);
        for (int i =0;i<size;i++){
            new Thread() {
                public void run() {
                    try {
                        startCountDownLatch.await();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    final int sleepTime=ThreadLocalRandom.current().nextInt(5)*1000;
                    template.execute("test",10000, new Callback() {
                        public Object onGetLock() throws InterruptedException {
                            System.out.println(Thread.currentThread().getName() + ":获取到锁--------getLock");
                            Thread.currentThread().sleep(sleepTime);
                            System.out.println(Thread.currentThread().getName() + ":等待---------sleeped:"+sleepTime);
                            endDownLatch.countDown();
                            return null;
                        }
                        public Object onTimeout() throws InterruptedException {
                            System.out.println(Thread.currentThread().getName() + ":超时---------timeout");
                            endDownLatch.countDown();
                            return null;
                        }
                    });
                }
            }.start();
        }
        startCountDownLatch.countDown();
        endDownLatch.await();
    }

public static void main(String[] args){
    RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
    CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:2181", retryPolicy);
    client.start();
    //本类多线程安全,可通过spring注入
    final ZkDistributedLockTemplate template=new ZkDistributedLockTemplate(client);
    template.execute("订单流水号", 5000, new Callback() {
        @Override
        public Object onGetLock() throws InterruptedException {
            //TODO 获得锁后要做的事

            System.out.println(Thread.currentThread().getName() + ":获取到锁--------getLock");
            return null;
        }

        @Override
        public Object onTimeout() throws InterruptedException {
            //TODO 获得锁超时后要做的事

            System.out.println(Thread.currentThread().getName() + ":超时---------timeout");
            return null;
        }
    });
}
}
