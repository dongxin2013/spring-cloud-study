package com.dongxin.cloud.feignclient;

import com.dongxin.cloud.entity.User;
import com.dongxin.config.FooConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <h3>spring-cloud-study</h3>
 * <p>使用Feign调用远程接口</p>
 *
 * @author : DongXin
 * @date : 2020-05-14 17:23
 **/
@FeignClient(name = "micro-service-provider",configuration = FooConfiguration.class)
public interface UserFeignClient {
    /**
     * 根据ID获取用户信息
     * 使用feign是会遇见三个问题，
     * 1.@GetMapping不支持，使用RequestMapping；
     * 2.接口地址必须为全路径；
     * 3.接口使用@PathVariable获取URL中的参数时会出错，建议添加为@PathVariable("id"),高版本已解决
     *
     * @param id 用户ID
     * @return User
     */

    @RequestLine("GET /user/getUser/{id}")
    User getUserById(@Param("id") String id);

    @RequestLine("POST /user/postUser")
    User postUser(@RequestBody User user);

}
