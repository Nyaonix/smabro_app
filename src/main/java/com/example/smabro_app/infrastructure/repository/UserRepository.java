package com.example.smabro_app.infrastructure.repository;

import com.example.smabro_app.domain.model.Users;
import com.example.smabro_app.infrastructure.mapper.UsersMapper;
import com.example.smabro_app.infrastructure.model.request.UserRequestQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final UsersMapper userMapper;

    public int userCreate(Users request) {

        return userMapper.insert(UserRequestQuery.from(request));
    }
}
