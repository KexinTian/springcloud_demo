package com.service.userconsume.service;

import com.service.userconsume.client.UserClient;
import com.service.userconsume.dao.UserDao;
import com.service.userconsume.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
//    @Autowired
//    private UserDao userDao;

    @Autowired
    private UserClient userClient;    //注入UserClient,使用 Feign 类似与 Mappper

//    @Autowired
//    private DiscoveryClient discoveryClient;// Eureka客户端，可以获取到服务实例信息

    public List<User> queryUserByIds(List<Long> ids) {
        List<User> users = new ArrayList<>();
        ids.forEach(id -> {
            // 我们测试多次查询，
            users.add(this.userClient.queryUserById(id));
        });
        return users;
    }
}
