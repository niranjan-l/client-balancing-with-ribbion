package com.niranjan2021.configribbon;


import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRibbonConfig {


    @Bean
    public IRule iRule() {

        return new RandomRule();
    }


    @Bean
    public IPing iPing() {

        return new PingUrl();
    }

}
