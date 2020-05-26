package com.onion.day.utils.service.impl;

import com.onion.day.utils.annotation.Enamy;
import com.onion.day.utils.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/5/26 11:40
 **/
@Service
public class HelloServiceImpl implements HelloService {
    private static Logger logger= LoggerFactory.getLogger(HelloServiceImpl.class);

    @Enamy(desc = "调用HelloService的sayHello()方法")
    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
