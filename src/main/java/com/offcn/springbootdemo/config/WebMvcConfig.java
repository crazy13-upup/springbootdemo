package com.offcn.springbootdemo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration//表示该java类相当于一个配置类，可替换配置文件
public class WebMvcConfig implements WebMvcConfigurer {


    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }





}
