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

    @Autowired
    private UserFeignClient userFeignClient;

    @Autowired
    private FeignClient2 feignClient2;


    @GetMapping("/movie/{id}")
    public User findById(@PathVariable String id) {
        return userFeignClient.getUserById(id);
    }

    @GetMapping("/test/{serviceName}")
    public String getServiceInfo(@PathVariable("serviceName")String serviceName) {
        return feignClient2.getEurekaInfoByServiceName(serviceName);
    }

}
