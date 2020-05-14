package com.dongxin.cloud.controller;


import com.dongxin.cloud.entity.User;
import com.dongxin.cloud.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author dongxin
 * @since 2019-11-13
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable String id){
        User user = userService.getById(id);
        System.out.println(user);
        return user;
    }
}
