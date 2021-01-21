package com.example.smabro_app.application.facade;

import com.example.smabro_app.application.service.UserService;
import com.example.smabro_app.domain.model.Users;
import com.example.smabro_app.presentation.dto.request.UserRequest;
import com.example.smabro_app.presentation.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;

@Service
@RequiredArgsConstructor
public class UserFacade {

    private final UserService userService;

    public int userCreate(@Nonnull final UserRequest request) {

        return userService.userCreate(Users.from(request));
    }
}
