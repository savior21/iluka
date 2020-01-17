package com.jxd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.jxd.springboot.mapper")
public class SecondApp {
    public static void main(String[] args) {
        SpringApplication.run(SecondApp.class,args);
    }
}
