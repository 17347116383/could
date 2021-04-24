package com.entity.app.config;


import com.entity.app.utils.RedisService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: mss   方法是否需要加锁切面
 * @Package: cn.com
 * @ClassName: LockAspect
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/6/4 17:27
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Aspect
@Component
@Order(5)
public class LockAspect {
    private static final Logger logger = LoggerFactory.getLogger(LockAspect.class);
    private static final String SUFFIX = "SUFFIX";
    @Autowired
    RedisService redisService;
    /**
     * 横切点
     */
   @Pointcut("@annotation(noRepeatSubmit)")
    public void repeatPoint(AdviceOneSystem noRepeatSubmit) {
    }
    /**
     *  接收请求，并记录数据
     */
    @Around(value = "repeatPoint(noRepeatSubmit)")
    public Object doBefore(ProceedingJoinPoint joinPoint, AdviceOneSystem noRepeatSubmit) throws Throwable {
   /*     String key = "HMP"+"NO_REPEAT_LOCK_PREFIX" ;
        Object[] args = joinPoint.getArgs();
        String name = "name";
        int argIndex = 0;
        String suffix;
        String token=null;
        if (StringUtils.isEmpty(name)) {
            suffix = String.valueOf(args[argIndex]);
        } else {
            Map<String, Object> keyAndValue = getKeyAndValue(args[argIndex]);
            token= (String) keyAndValue.get("token");
            Object valueObj = keyAndValue.get(name);
            if (valueObj == null) {
                suffix = SUFFIX;
            } else {
                suffix = String.valueOf(valueObj);
            }
        }
        key = key + ":" + suffix+":"+token;
        logger.info("-------lock key--------- : " + key);
        int seconds = 6000;
        logger.info("-------seconds--------- : " + seconds);
        Object cacheObject =null;// redisService.getCacheObject(key);
        if (cacheObject!=null){
            System.out.println("-------cacheObject--------->"+cacheObject);
            return cacheObject;
        }*/
        //redisService.setCacheObject(key,key, 6000, TimeUnit.MILLISECONDS);
        try {
            Object proceed = joinPoint.proceed();
            return proceed;
        } catch (Throwable throwable) {
            logger.error("运行业务代码出错", throwable);
            throw new RuntimeException(throwable.getMessage());
        } finally {
            //lockService.unLock(key);
        }
    }

    public static Map<String, Object> getKeyAndValue(Object obj) {
        Map<String, Object> map = new HashMap();
        // 得到类对象
        Class userCla = (Class) obj.getClass();
        /* 得到类中的所有属性集合 */
        Field[] fs = userCla.getDeclaredFields();
        for (int i = 0; i < fs.length; i++) {
            Field f = fs[i];
            // 设置些属性是可以访问的
            f.setAccessible(true);
            Object val = new Object();
            try {
                val = f.get(obj);
                // 得到此属性的值
                // 设置键值
                map.put(f.getName(), val);
            } catch (IllegalArgumentException e) {
                logger.error("getKeyAndValue IllegalArgumentException", e);
            } catch (IllegalAccessException e) {
                logger.error("getKeyAndValue IllegalAccessException", e);
            }

        }
        //logger.info("扫描结果：" + gson.toJson(map));
        return map;
    }
}
