package com.hzh.com.hzhcom.controller.Redisson;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: ZUHUA.HUANG
 * @Description: ${description}
 * @Date: 2020/7/11
 * @Version: 1.0
 * @Description: TODO()
 */
@RestController
public class UserController extends AbstractController {


    /**
     * 单机
     * @return
     */
   /* @RequestMapping(value = "get")
    @ResponseBody
    public  BaseResponse  get (){
         BaseRequest request = new BaseRequest();
        BaseResponse baseResponse = ResponseUtils.initResponse( request);
        ResponseUtils.setResponseTime(baseResponse);
        return baseResponse;
    }
*/
}
