package com.jxd.springboot.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "user")
public class User {
    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增
    private Integer id;
    private String username;
    private String password;
    private String sex;
}
