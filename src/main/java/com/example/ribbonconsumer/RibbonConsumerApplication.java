package com.example.ribbonconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 通过@EnableDiscoveryClient注解让该应用注册
 * 为 Eureka 客户端应用，以获得服务发现的能力。
 * 同时，在该主类中创建 RestTemplate的Spring
 * Bean实例，并通过 @LoadBalanced 注解开启客户
 * 端负载均衡。
 * @author young
 */
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonConsumerApplication {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonConsumerApplication.class, args);
    }

}
