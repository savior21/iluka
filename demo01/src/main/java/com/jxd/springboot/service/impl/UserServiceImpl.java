package com.jxd.springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.jxd.springboot.mapper.UserMapper;
import com.jxd.springboot.pojo.User;
import com.jxd.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
   private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.selectAll();
    }

    @Override
    public List<User> page(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        return userMapper.selectAll();
    }

    @Override
    public User findById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public User save(User user) {
        int result = userMapper.insert(user);
        System.out.println(result);
        return  result>0?user:null;
    }

    @Override
    public int update(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int delete(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }
}
