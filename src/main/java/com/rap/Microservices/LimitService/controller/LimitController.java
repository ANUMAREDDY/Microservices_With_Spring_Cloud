package com.rap.Microservices.LimitService.controller;

import com.rap.Microservices.LimitService.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @GetMapping(path="/limits")
    public Limits retriveLimits(){
        return new Limits(1, 1000);
    }


}
