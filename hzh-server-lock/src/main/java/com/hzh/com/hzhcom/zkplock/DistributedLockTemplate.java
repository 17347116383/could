package com.hzh.com.hzhcom.zkplock;

/**
 * 分布式锁模板类
 * @ProjectName:
 * @Package:
 * @ClassName: DistributedLockTemplate
 * @Author: Administrator
 * @Description:
 * @Date:
 * @Version: 1.0
 * @Description: TODO
 */
public interface DistributedLockTemplate {

    /**
     *
     * @param lockId 锁id(对应业务唯一ID)
     * @param timeout 单位毫秒
     * @param callback 回调函数
     * @return
     */
    public Object execute(String lockId, int timeout, Callback callback);
}
