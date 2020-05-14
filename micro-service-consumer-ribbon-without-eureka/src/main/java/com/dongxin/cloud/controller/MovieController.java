package com.dongxin.cloud.controller;

import com.dongxin.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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

  private RestTemplate restTemplate;

  private LoadBalancerClient loadBalancerClient;

  @Autowired
  public void setRestTemplate(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Autowired
  public void setLoadBalancerClient(LoadBalancerClient loadBalancerClient) {
    this.loadBalancerClient = loadBalancerClient;
  }

  @GetMapping("/movie/{id}")
  public User findById(@PathVariable Long id) {
   return this.restTemplate.getForObject("http://micro-service-provider/user/getUser/" + id, User.class);
  }

  @GetMapping("movie/test")
  public String test(){
    ServiceInstance serviceInstance = loadBalancerClient.choose("micro-service-provider");
    System.out.println(serviceInstance.getServiceId()+":"+serviceInstance.getHost()+":"+serviceInstance.getPort());
    return "1";
  }
}
