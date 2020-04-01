package com.ltz.consumer;

import com.ltz.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-consumer.xml"});
        context.start();
        System.out.println("发布服务成功");
        System.in.read();
        IUserService userService = (IUserService) context.getBean("userService");
        System.out.println("获取服务器的反馈信息"+userService.hello());
    }
}
