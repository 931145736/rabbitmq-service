package com.qingshuo.growthservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Test
 * @Author Administrator
 * @Date 2019/7/4 11:08
 * @Version 1.0
 **/
@RestController
public class Test {

    @RequestMapping("/say")
    public String say(){
        return "hello";
    }
}
