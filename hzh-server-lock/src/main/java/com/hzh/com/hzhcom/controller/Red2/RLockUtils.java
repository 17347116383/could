package com.hzh.com.hzhcom.controller.Red2;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.util.concurrent.TimeUnit;

/**
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: ZUHUA.HUANG
 * @Description: ${description}
 * @Date: 2020/7/12
 * @Version: 1.0
 * @Description: TODO()
 */
public class RLockUtils {



    /**
     *  单机
     * @return
     * @throws InterruptedException
     */
    public static RLock  getSingleRedissonClient () throws InterruptedException {
        // 构造redisson实现分布式锁必要的Config
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379")
                .setPassword(null)
                .setDatabase(0);
        // 构造RedissonClient
        RedissonClient redissonClient = Redisson.create(config);
        // 设置锁定资源名称
        RLock disLock = redissonClient.getLock("DISLOCK");
        //尝试获取分布式锁
       // disLock.lock();
        return  disLock;
    }

    /**
     *  哨兵
     * @return
     * @throws InterruptedException
     */
    public static RLock  getSentryRedissonClient () throws InterruptedException {
        // 构造redisson实现分布式锁必要的Config
        Config config = new Config();
        config.useSentinelServers().addSentinelAddress(
                "redis://127.0.0.1:6379","redis://127.0.0.1:6780", "redis://127.0.0.1:6781")
                .setMasterName("redis6379")
                 .setPassword(null)
                .setDatabase(0);
        // 构造RedissonClient
        RedissonClient redissonClient = Redisson.create(config);
        // 设置锁定资源名称
        RLock disLock = redissonClient.getLock("DISLOCK");
        // disLock.lock();
        return   disLock;
    }




    /**
     *集群
     * @return
     * @throws InterruptedException
     */
    public static RLock  getClusterRedissonClient () throws InterruptedException {
      /*  Config config = new Config();
        config.useClusterServers().addNodeAddress(
                "redis://172.29.3.245:6375","redis://172.29.3.245:6376", "redis://172.29.3.245:6377",
                "redis://172.29.3.245:6378","redis://172.29.3.245:6379", "redis://172.29.3.245:6380")
                .setPassword(null).setScanInterval(5000);
        // 构造RedissonClient
        RedissonClient redissonClient = Redisson.create(config);*/
        // 设置锁定资源名称
        RLock disLock =null;// redissonClient.getLock("DISLOCK");
        //
        // disLock.lock();
        return   disLock;
    }
}
