package com.dongxin.cloud.controller;

import com.dongxin.cloud.entity.User;
import com.dongxin.cloud.feignclient.FeignClient2;
import com.dongxin.cloud.feignclient.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DongXin
 */
@RestController
public class MovieController {

    private UserFeignClient userFeignClient;

    private FeignClient2 feignClient2;

    @Autowired
    public void setFeignClient(FeignClient2 feignClient2) {
        this.feignClient2 = feignClient2;
    }


    @Autowired
    public void setUserFeignClient(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable String id) {
        return userFeignClient.getUserById(id);
    }

    @GetMapping("/test")
    public User testPost(User user) {
        return userFeignClient.postUser(user);
    }

    @GetMapping("/test/{serviceName}")
    public String getServiceInfo(@PathVariable("serviceName")String serviceName) {
        return feignClient2.getEurekaInfoByServiceName(serviceName);
    }

}
