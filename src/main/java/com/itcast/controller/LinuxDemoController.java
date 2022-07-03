package com.itcast.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/linux")
public class LinuxDemoController {

    @GetMapping("")
    public String hello(){
        System.out.println("hello world...");
        return "OK linuxdemo git";
    }
}
