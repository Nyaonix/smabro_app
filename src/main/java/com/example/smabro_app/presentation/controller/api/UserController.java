package com.example.smabro_app.presentation.controller.api;

import com.example.smabro_app.application.facade.UserFacade;
import com.example.smabro_app.presentation.dto.request.UserRequest;
import com.example.smabro_app.presentation.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserFacade userFacade;

    @PostMapping("/")
    public UserResponse userCreate(@ModelAttribute UserRequest request) {

        return userFacade.userCreate(request);
    }
}
