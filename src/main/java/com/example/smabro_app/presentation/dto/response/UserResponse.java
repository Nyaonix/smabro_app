package com.example.smabro_app.presentation.dto.response;

import com.example.smabro_app.domain.model.Users;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(access = AccessLevel.PRIVATE)
public class UserResponse {

    private String name;

    private String password;

    private int rate;

    private int mainCharacterId;

    private int sub1CharacterId;

    private int sub2CharacterId;

    public static UserResponse from(Users user) {

        return UserResponse.builder()
                .name(user.getName())
                .password(user.getPassword())
                .rate(user.getRate())
                .mainCharacterId(user.getMainCharacterId())
                .sub1CharacterId(user.getSub1CharacterId())
                .sub2CharacterId(user.getSub2CharacterId())
                .build();
    }
}
