package com.example.smabro_app.infrastructure.model.request;

import com.example.smabro_app.domain.model.Users;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(access = AccessLevel.PRIVATE)
public class UserRequestQuery {

    private String name;

    private String password;

    private int rate;

    private int mainCharacterId;

    private int sub1CharacterId;

    private int sub2CharacterId;

    public static UserRequestQuery from(Users request) {

        return UserRequestQuery.builder()
                .name(request.getName())
                .password(request.getPassword())
                .rate(request.getRate())
                .mainCharacterId(request.getMainCharacterId())
                .sub1CharacterId(request.getSub1CharacterId())
                .sub2CharacterId(request.getSub2CharacterId())
                .build();
    }
}
