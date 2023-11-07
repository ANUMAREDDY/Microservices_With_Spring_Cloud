package com.rap.Microservices.LimitService.controller;

import com.rap.Microservices.LimitService.bean.Limits;
import com.rap.Microservices.LimitService.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    private Configuration configuration;
    @GetMapping(path="/limits")
    public Limits retriveLimits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }


}
