package com.dongxin.cloud.feignclient;

import com.dongxin.cloud.entity.User;
import org.springframework.stereotype.Component;

/**
 * <h3>spring-cloud-study</h3>
 * <p></p>
 *
 * @author : DongXin
 * @date : 2020-05-18 15:40
 **/
@Component
public class HystrixClientFallback implements UserFeignClient  {
    @Override
    public User getUserById(String id) {
        User user = new User();
        user.setId(0L);
        return user;
    }
}
