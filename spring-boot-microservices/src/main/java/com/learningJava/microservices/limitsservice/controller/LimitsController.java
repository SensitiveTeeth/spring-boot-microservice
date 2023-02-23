package com.learningJava.microservices.limitsservice.controller;

import com.learningJava.microservices.limitsservice.bean.Limits;
import com.learningJava.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private final Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(this.configuration.getMinimum(),this.configuration.getMaximum());
    }
}

