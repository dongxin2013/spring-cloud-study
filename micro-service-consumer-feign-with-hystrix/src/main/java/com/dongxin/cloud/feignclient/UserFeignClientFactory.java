package com.dongxin.cloud.feignclient;

import com.dongxin.cloud.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * <h3>spring-cloud-study</h3>
 * <p></p>
 *
 * @author : DongXin
 * @date : 2020-05-18 17:10
 **/
@Component
public class UserFeignClientFactory implements FallbackFactory<UserFeignClient> {
    @Override
    public UserFeignClient create(Throwable cause) {

        return id -> {
            User user = new User();
            user.setId(-1L);
            return user;
        };
    }
}
