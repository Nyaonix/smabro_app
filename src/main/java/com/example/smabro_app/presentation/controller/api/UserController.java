package com.example.smabro_app.presentation.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hoge")
    public String hoge() {

        return "hello";
    }
}
