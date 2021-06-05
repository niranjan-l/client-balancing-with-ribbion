package com.niranjan2021.clientbalancingwithribbion;


import com.niranjan2021.configribbon.MyRibbonConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient( name = "goodbye",configuration = MyRibbonConfig.class)
public class GoodByeLoadBalancingConfig {
}
