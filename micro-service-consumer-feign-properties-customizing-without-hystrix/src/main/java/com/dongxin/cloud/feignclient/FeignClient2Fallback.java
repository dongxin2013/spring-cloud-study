package com.dongxin.cloud.feignclient;

import org.springframework.stereotype.Component;

/**
 * <h3>spring-cloud-study</h3>
 * <p></p>
 *
 * @author : DongXin
 * @date : 2020-05-18 16:29
 **/
@Component
public class FeignClient2Fallback implements FeignClient2 {
    @Override
    public String getEurekaInfoByServiceName(String serviceName) {
        return "hello";
    }
}
