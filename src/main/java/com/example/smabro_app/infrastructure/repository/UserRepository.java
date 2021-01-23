package com.example.smabro_app.infrastructure.repository;

import com.example.smabro_app.domain.model.User;
import com.example.smabro_app.infrastructure.mapper.UsersMapper;
import com.example.smabro_app.infrastructure.model.request.UserRequestQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final UsersMapper userMapper;

    public int userCreate(User request) {

        return userMapper.insert(UserRequestQuery.from(request));
    }

    public User findByUserName(String name) {

        return User.from(userMapper.findByUserName(name));
    }
}
