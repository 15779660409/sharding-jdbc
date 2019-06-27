package com.shardingjdbc.kang.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shardingjdbc.kang.inter.entity.User;
import com.shardingjdbc.kang.inter.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kanghaijun
 * @create 2019/6/26
 * @describe
 */
@RestController
@RequestMapping("user")
public class UserController {

    private int i = 0;

    @Reference
    private UserService userService;

    @PostMapping("/save")
    public String saveUser() {
        i++;
        User user = new User();
        user.setId(i);
        user.setAge(18);
        user.setName("kaka");
        user.setSex(0);
        userService.save(user);
        return "success";
    }

    @GetMapping("/get")
    public User getUser(Integer userId) {
       User user = new User();
       user.setId(userId);
       return userService.get(user);
    }


}
