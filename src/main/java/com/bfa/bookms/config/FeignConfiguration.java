package com.bfa.bookms.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.bfa.bookms")
public class FeignConfiguration {

}
