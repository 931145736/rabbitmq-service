package com.example.demo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息接收者
 */
@Component
//@RabbitListener(queues = "hello")  //表示该类对hello队列进行监听
public class Receiver {


    /*@RabbitHandler  //指定对消息的处理方法
    public void receiver(String hello){
        System.out.println("receiver message :"+hello);
    }*/

}
