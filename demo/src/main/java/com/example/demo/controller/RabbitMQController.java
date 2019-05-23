package com.example.demo.controller;

import com.example.demo.productor.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RabbitMQController {

    @Autowired
    private Sender sender;


    @Bean
    @LoadBalanced
   RestTemplate restTemplate(){
       return new RestTemplate();
   }

    @RequestMapping("/sendMessage")
    public String  sendMessage(){
        sender.send();
        return "ok";
    }

    @RequestMapping("/testSleuth")
    public String test(){
        return restTemplate().getForEntity("http://localhost:7003/userName",String.class).getBody();
    }
}
