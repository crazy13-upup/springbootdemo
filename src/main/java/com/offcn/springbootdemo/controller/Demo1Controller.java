package com.offcn.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class Demo1Controller {

    @RequestMapping("/aa")
    public Map<String,Object> get(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","xioaming");
        map.put("age",18);
        return map;
    }
}
