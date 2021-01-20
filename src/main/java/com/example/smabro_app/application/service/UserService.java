package com.example.smabro_app.application.service;

import com.example.smabro_app.domain.model.Users;
import com.example.smabro_app.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Users userCreate(Users request) {

        return userRepository.userCreate(request);
    }
}
