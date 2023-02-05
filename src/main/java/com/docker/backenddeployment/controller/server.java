package com.docker.backenddeployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class server {
    @GetMapping("server")
    public String server() {
        return "Server Running!";
    }

    @GetMapping("user/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "Hi " + name;
    }
}
