package com.ltz;

import com.ltz.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-consumer.xml")
public class ConsumerSpringbootXmlApplication {

    @Autowired
    private IUserService userServicer;

    @Test
    public void contextLoad(){
        String hello = userServicer.hello();
        System.out.println(hello);
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSpringbootXmlApplication.class, args);
    }

}
