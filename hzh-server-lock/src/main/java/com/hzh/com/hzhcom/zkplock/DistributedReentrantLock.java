package com.hzh.com.hzhcom.zkplock;

import java.util.concurrent.TimeUnit;

/**
 * @ProjectName:
 * @Package:
 * @ClassName: DistributedReentrantLock
 * @Author: Administrator
 * @Description:
 * @Date:
 * @Version: 1.0
 * @Description: TODO
 */
public interface DistributedReentrantLock {
    public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException;

    public void unlock();
}
