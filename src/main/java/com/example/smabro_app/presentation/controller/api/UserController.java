package com.example.smabro_app.presentation.controller.api;

import com.example.smabro_app.application.facade.UserFacade;
import com.example.smabro_app.presentation.dto.request.UserRequest;
import com.example.smabro_app.presentation.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserFacade userFacade;

    @PostMapping("/")
    public int userCreate(@RequestBody UserRequest request) {

        return userFacade.userCreate(request);
    }

    @GetMapping("/")
    public UserResponse findByUserName(@RequestParam("name") String name) {

        return userFacade.findByUserName(name);
    }
}
