package com.github.vskrahul.actuator_demo.controller;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "custom")
public class CustomEndpoint {
    @ReadOperation
    public String hello() {
        return "Hello, I am custom actuator endpoint";
    }
}
