package com.niranjan2021.clientbalancingwithribbion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {


    @Autowired
    public RestTemplate restTemplate;


    @GetMapping
    public String getDate() {

        return restTemplate.getForEntity("http://goodbye", String.class).getBody();
    }
}
