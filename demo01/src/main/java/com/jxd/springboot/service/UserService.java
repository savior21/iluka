package com.jxd.springboot.service;

import com.jxd.springboot.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    //查询所有
    List<User> list();

    //分页查询
    List<User> page(Integer page,Integer size);

    //根据主键id查询
    User findById(Integer id);

    //增加用户
    User save(User user);

    //更改用户
    int update(User user);

    //根据主键删除用户
    int delete(Integer id);



}
