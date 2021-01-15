package com.yongle.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leyangjie
 * @date 2020/12/13 16:18
 * @describe
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping
    public String testHello() {
        return "test hello";
    }
}
