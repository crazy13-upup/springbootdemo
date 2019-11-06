package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.bean.Car;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController //等价于@Responsebody + @Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/getCar/{name}")
    public String getCar(@RequestParam(name = "id") Integer id, @PathVariable(name="name") String name){
        Car car = new Car();
        car.setName(name);
        car.setId(id);
        car.setCreateTime(new Date());
        return "car:"+car;
    }
}
