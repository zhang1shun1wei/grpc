package com.kone.pbdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kone
 * @date 2022/2/8
 */
@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("name")
    public String getUser() {
        return "this is name";
    }
}
