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

/**
 * @ProjectName: mss   重复请求控制切面
 * @Package: cn.com
 * @ClassName: RepeatedRequestControlAspect
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/6/4 17:27
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Aspect
@Component
@Order(2)
public class RepeatedRequestControlAspect {
    private static final Logger logger = LoggerFactory.getLogger(LockAspect.class);

    @Autowired
    private RedisService redisService;

    /**
     * 将表达式【* com.aspire.controller.AopController.*(..))】所匹配的所有方法标记为切点，
     * 切点名为 excudeAdvice()
     * 注:execution里的表达式所涉及到的类名(除了基本类以外)，其它的要用全类名;干脆不管是不是基础类，都推荐使用全类名
     * @author
     * @date 2020
     */
    // @Pointcut("execution(* com.aspire.controller.AopController.*(..))")
    /**
     * 使用注解来定位AOP作为节点的方法们
     */
    //@Pointcut("@annotation(com.example.demo.config.AdviceOneSystem)")
    @Pointcut("execution(* com.*.*.controller.*.*(..))")
    public void excudeAdvice() {
    }


    @Around("excudeAdvice()")
    public Object aroundAdvice(ProceedingJoinPoint thisJoinPoint) throws Throwable {
        String threadName = Thread.currentThread().getName();
        Object obj = null;

        System.err.println(threadName + " -> 重复请求控制执行了");
        try {
            // 执行被增强方法，并获取到返回值
            // 类似于 过滤器的chain.doFilter(req,resp)方法
            obj = thisJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return obj;
    }

}
