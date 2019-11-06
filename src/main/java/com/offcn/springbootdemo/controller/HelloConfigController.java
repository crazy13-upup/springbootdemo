package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user01")
@EnableConfigurationProperties({User.class})
public class HelloConfigController {

    @Autowired
    private  User user;

    @RequestMapping("/getUser01")
    public String getUser01(){
        return user.toString();
    }

}
