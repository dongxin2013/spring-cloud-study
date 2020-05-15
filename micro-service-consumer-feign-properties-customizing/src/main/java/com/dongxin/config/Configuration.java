package com.dongxin.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * <h3>spring-cloud-study</h3>
 * <p></p>
 *
 * @author : DongXin
 * @date : 2020-05-15 15:47
 **/
@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("dongxin", "dx369*");
    }
}
