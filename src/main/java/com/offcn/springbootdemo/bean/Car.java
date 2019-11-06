package com.offcn.springbootdemo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

@Data//setter getter toString 等等
@NoArgsConstructor//无参构造器
@AllArgsConstructor//有参构造器
public class Car {
    private String name;
    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

}
