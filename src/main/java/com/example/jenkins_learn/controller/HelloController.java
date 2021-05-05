package com.example.jenkins_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author taoqz
 * @date 2021/5/5 17:26
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String demo(){
        return "真的是最后!";
    }
}
