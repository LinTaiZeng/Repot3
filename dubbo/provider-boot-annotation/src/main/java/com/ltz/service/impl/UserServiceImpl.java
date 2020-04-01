package com.ltz.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ltz.service.IUserService;
import org.springframework.stereotype.Component;

@Component//这是个spring组建，受spring管理
@Service//这是个dubbo组件，用于dubbo发布服务
public class UserServiceImpl implements IUserService {
    public String hello() {
        return "Springboot整合Dubbo !";
    }
}
