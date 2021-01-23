package com.example.smabro_app.application.service;

import com.example.smabro_app.domain.model.User;
import com.example.smabro_app.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public int userCreate(User request) {

        return userRepository.userCreate(request);
    }

    public User findByUserName(String name) {

        return userRepository.findByUserName(name);
    }
}
