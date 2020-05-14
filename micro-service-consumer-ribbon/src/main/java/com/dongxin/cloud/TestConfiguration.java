package com.dongxin.cloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <h3>spring-cloud-study</h3>
 * <p>Ribbon配置类</p>
 *
 * @author : DongXin
 * @date : 2020-05-14 10:26
 **/
@Configuration
@ExcludeFromComponentScan
public class TestConfiguration {

    /**
     * 使用配置类实现 负载均衡访问--随机
     * @return
     */
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
