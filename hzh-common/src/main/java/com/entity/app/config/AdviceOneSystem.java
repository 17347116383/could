package com.entity.app.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标志性注解
 *
 * @author
 * @date 2019
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AdviceOneSystem {

    //是否锁
    boolean LockFlag() default false;

    /**
     * 锁过期的时间
     * */
    int seconds() default 5;
    /**
     * 锁的位置
     * */
    String location() default "NRest";

    //权限
    String security() default "admin";
}
