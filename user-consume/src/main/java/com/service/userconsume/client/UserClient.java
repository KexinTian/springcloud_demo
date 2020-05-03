package com.service.userconsume.client;

import com.service.userconsume.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service", fallback = UserFeignClientFallback.class)
public interface UserClient {
    @GetMapping("/user/{id}")
    User queryUserById(@PathVariable("id") Long id);
}
