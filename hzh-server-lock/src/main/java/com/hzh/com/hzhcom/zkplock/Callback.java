package com.hzh.com.hzhcom.zkplock;

/**
 * @ProjectName:
 * @Package:
 * @ClassName:Callback
 * @Author: Administrator
 * @Description:
 * @Date:
 * @Version: 1.0
 * @Description: TODO
 */
public interface Callback {

    public Object onGetLock() throws InterruptedException;

    public Object onTimeout() throws InterruptedException;
}
