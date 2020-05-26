package com.onion.day.utils.controller;

import com.onion.day.utils.annotation.Enamy;
import com.onion.day.utils.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/5/26 11:43
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;
    private static Logger logger= LoggerFactory.getLogger(HelloController.class);

    @Enamy(desc = "测试01")
    @RequestMapping("/hi")
    public String hello(){
        return "sdsa";
    }
    @Enamy(desc = "调用hello接口")
    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name){
        return helloService.sayHello(name);
    }
}
