package com.service.userservice;

import com.service.userservice.pojo.User;
import com.service.userservice.service.UserService;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserServiceApplicationTests {

    @Resource
    UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSelectUser() throws InterruptedException {
        User user = userService.queryById(1L);
    }

}
