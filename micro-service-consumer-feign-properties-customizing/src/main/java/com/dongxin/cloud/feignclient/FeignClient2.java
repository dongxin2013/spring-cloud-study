package com.dongxin.cloud.feignclient;

import com.dongxin.config.Configuration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <h3>spring-cloud-study</h3>
 * <p>使用Feign调用远程接口</p>
 *
 * @author : DongXin
 * @date : 2020-05-14 17:23
 **/
@FeignClient(name = "Test",url="http://localhost:8761/",configuration = Configuration.class)
public interface FeignClient2 {
    /**
     * 根据服务名称获取服务信息
     * @param serviceName
     * @return
     */
    @RequestMapping(value = "/eureka/apps/{serviceName}",method = RequestMethod.GET)
    String getEurekaInfoByServiceName(@PathVariable("serviceName") String serviceName);

}
