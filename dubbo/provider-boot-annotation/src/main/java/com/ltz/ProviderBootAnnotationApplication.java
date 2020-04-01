package com.ltz;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ProviderBootAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderBootAnnotationApplication.class, args);
    }

}
