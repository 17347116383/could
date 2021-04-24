package com.huang.hzhfeign.controller;





import com.huang.hzhfeign.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: hzh-spring-cloud
 * @Package: com.huang.hzhfeign.controller
 * @ClassName: UserController
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2019/12/8 19:05
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@RestController
public class UserController {


    @Autowired
    private UserServer used;

    //http://127.0.0.1:9001/hzh/ribbon?msg=12312313
    @RequestMapping(value = "/hzh/ribbon")
    public  String getUser( @RequestParam(value = "msg") String msg){
        System.out.println("----9001-------"+msg);
        return  used.getUser(msg);
    }

    //
    @RequestMapping(value = "/hzh/ri")
    @ResponseBody
    public   String  getS(){
        System.out.println("------9001----------ri------------------");
        return  "ri";
    }



    @RequestMapping(value = "/hzh/ooo")
    @ResponseBody
    public   String  ooo(){
        System.out.println("------ooo----------0000------------------");
        return  "ooooooooo";
    }

    @RequestMapping(value = "/hzh/gateway")
    @ResponseBody
    public   String  gateway(){
        System.out.println("------    @RequestMapping(value = \"/hzh/gateway\")\n------------------");
        return  "    @RequestMapping(value = \"/hzh/gateway\")\n";
    }

}
