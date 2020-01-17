package com.jxd.springboot.web;

import com.jxd.springboot.pojo.User;
import com.jxd.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> list(){
        return userService.list();
    }

    @RequestMapping("/page")
    public List<User> page(@RequestParam(name = "page",defaultValue = "1") Integer page,@RequestParam(name = "size",defaultValue = "5") Integer size){
        return userService.page(page, size);
    }

    @RequestMapping("/find")
    public User find(@RequestParam("id") Integer id){
        return userService.findById(id);
    }

    @RequestMapping("/save")
    public User save(User user){
        return userService.save(user);
    }

    @RequestMapping("/update")
    public int update(User user){
        return userService.update(user);
    }

    @RequestMapping("/delete")
    public int delete(@RequestParam("id") Integer id){
        return userService.delete(id);
    }




}
