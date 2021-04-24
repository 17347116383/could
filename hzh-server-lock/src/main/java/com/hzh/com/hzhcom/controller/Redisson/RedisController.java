package com.hzh.com.hzhcom.controller.Redisson;


import com.hzh.com.hzhcom.controller.Red2.RLockUtils;

import com.hzh.com.hzhcom.entity.BaseRequest;
import com.hzh.com.hzhcom.entity.BaseResponse;
import com.hzh.com.hzhcom.entity.ResponseUtils;
import org.redisson.Redisson;
import org.redisson.api.RFuture;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @ProjectName:   https://github.com/redisson/redisson/wiki/2.-%E9%85%8D%E7%BD%AE%E6%96%B9%E6%B3%95#24-%E9%9B%86%E7%BE%A4%E6%A8%A1%E5%BC%8F
 * @Package:          分布式锁
 * @ClassName:
 * @Author: ZUHUA.HUANG
 * @Description: ${description}
 * @Date: 2020/2/5
 * @Version: 1.0
 * @Description: TODO()
 */
@RestController
public class RedisController  extends AbstractController {

  //  redis://[:password]@host:port/db    # TCP连接
  //  rediss://[:password]@host:port/db   # Redis TCP+SSL 连接
  //  unix://[:password]@/path/to/socket.sock?db=db    # Redis Unix Socket 连接
    /**
     * 单机
     * @return
     */
    @RequestMapping(value = "get/1" ,method = RequestMethod.POST )
    @ResponseBody
    public BaseResponse get (){
        BaseRequest request = new BaseRequest();
        BaseResponse baseResponse = ResponseUtils.initResponse( request);

        RLock singleRedissonClient=null;
        try {
            singleRedissonClient = RLockUtils.getSingleRedissonClient();
            // 1. 最常见的使用方法
            // lock.lock();
            // 2. 支持过期解锁功能,10秒钟以后自动解锁, 无需调用unlock方法手动解锁
            // lock.lock(10, TimeUnit.SECONDS);
            // 3. 尝试加锁，最多等待5秒，上锁以后15秒自动解锁
            // singleRedissonClient.tryLock(3000 ,15000,TimeUnit.MILLISECONDS);
            //是否获取到锁
            //final boolean locked = singleRedissonClient.isLocked();
            //RFuture<Void> lockAsync = singleRedissonClient.lockAsync(2000L, TimeUnit.MILLISECONDS);
            //RFuture<Void> voidRFuture = singleRedissonClient.lockAsync(2000L, TimeUnit.MILLISECONDS, 5000L);
            //2m拿不到锁, 就认为获取锁失败。10s是锁失效时间。
            boolean isLock =singleRedissonClient.tryLock(2000 ,15000,TimeUnit.MILLISECONDS);
            if (isLock) {
                //TODO if get lock success, do something;
                Thread.sleep(2000);
            }
        } catch (Exception e) {
        } finally {
            // 无论如何, 最后都要解锁
            singleRedissonClient.unlock();
        }
        ResponseUtils.setResponseTime(baseResponse);
        return  baseResponse;
    }


    /**
     * 哨兵模式
     * @return
     */
    @RequestMapping(value = "get/2",method = RequestMethod.POST )
    @ResponseBody
    public  BaseResponse  getto (){

        BaseRequest request = new BaseRequest();
        BaseResponse baseResponse = ResponseUtils.initResponse( request);
        // 构造redisson实现分布式锁必要的Config
        /*Config config = new Config();
        config.useSentinelServers().addSentinelAddress(
                "redis://127.0.0.1:6379","redis://127.0.0.1:6780", "redis://127.0.0.1:6781")
                .setMasterName("redis6379")
               // .setPassword("6379")
                .setDatabase(0);


        // 构造RedissonClient
        RedissonClient redissonClient = Redisson.create(config);
        // 设置锁定资源名称
        RLock disLock = redissonClient.getLock("DISLOCK");
        boolean isLock;
        try {
            //尝试获取分布式锁
            isLock = disLock.tryLock(500, 15000, TimeUnit.MILLISECONDS);
            if (isLock) {
                //TODO if get lock success, do something;
                Thread.sleep(15000);
            }
        } catch (Exception e) {
        } finally {
            // 无论如何, 最后都要解锁
            disLock.unlock();
        }
*/
        ResponseUtils.setResponseTime(baseResponse);
        return  baseResponse;
    }

    /**
     * 集群
     * @return
     */
    @RequestMapping(value = "get/3",method = RequestMethod.POST )
    @ResponseBody
    public  BaseResponse  gettou (){
        BaseRequest request = new BaseRequest();
        BaseResponse baseResponse = ResponseUtils.initResponse( request);
/*
    Config config = new Config();
    config.useClusterServers().addNodeAddress(
        "redis://172.29.3.245:6375","redis://172.29.3.245:6376", "redis://172.29.3.245:6377",
                "redis://172.29.3.245:6378","redis://172.29.3.245:6379", "redis://172.29.3.245:6380")
        .setPassword("6379").setScanInterval(5000);
        // 构造RedissonClient
        RedissonClient redissonClient = Redisson.create(config);
        // 设置锁定资源名称
        RLock disLock = redissonClient.getLock("DISLOCK");
        boolean isLock;
        try {
            //尝试获取分布式锁
            isLock = disLock.tryLock(500, 15000, TimeUnit.MILLISECONDS);
            if (isLock) {
                //TODO if get lock success, do something;
                Thread.sleep(15000);
            }
        } catch (Exception e) {
        } finally {
            // 无论如何, 最后都要解锁
            disLock.unlock();
        }
*/
        ResponseUtils.setResponseTime(baseResponse);
        return  baseResponse;
    }
}
