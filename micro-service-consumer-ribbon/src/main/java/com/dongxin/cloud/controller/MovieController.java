package com.dongxin.cloud.controller;

import com.dongxin.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author DongXin
 */
@RestController
public class MovieController {

  @Resource
  private RestTemplate restTemplate;

  @GetMapping("/movie/{id}")
  public User findById(@PathVariable Long id) {
   return this.restTemplate.getForObject("http://micro-service-provider/user/getUser/" + id, User.class);
  }
}
