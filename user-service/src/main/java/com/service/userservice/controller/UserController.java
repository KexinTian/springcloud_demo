package com.service.userservice.controller;

import com.service.userservice.pojo.User;
import com.service.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User queryById(@Validated @PathVariable("id") Long id) throws InterruptedException {
        return this.userService.queryById(id);
    }
}