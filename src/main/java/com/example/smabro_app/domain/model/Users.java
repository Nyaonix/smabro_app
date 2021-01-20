package com.example.smabro_app.domain.model;

import com.example.smabro_app.infrastructure.model.response.UserResponseQuery;
import com.example.smabro_app.presentation.dto.request.UserRequest;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;

/**
 * Table: Users
 */
@Data
@Builder(access = AccessLevel.PRIVATE)
public class Users {

    /**
     * Column: name
     */
    private String name;

    /**
     * Column: password
     */
    private String password;

    /**
     * Column: rate
     */
    private Integer rate;

    /**
     * Column: main_character_id
     */
    private Integer mainCharacterId;

    /**
     * Column: sub1_character_id
     */
    private Integer sub1CharacterId;

    /**
     * Column: sub2_character_id
     */
    private Integer sub2CharacterId;

    public static Users from(UserRequest request) {

        return Users.builder()
                .name(request.getName())
                .password(request.getPassword())
                .rate(request.getRate())
                .mainCharacterId(request.getMainCharacterId())
                .sub1CharacterId(request.getSub1CharacterId())
                .sub2CharacterId(request.getSub2CharacterId())
                .build();
    }

    public static Users from(UserResponseQuery responseQuery) {

        return Users.builder()
                .name(responseQuery.getName())
                .password(responseQuery.getPassword())
                .rate(responseQuery.getRate())
                .mainCharacterId(responseQuery.getMainCharacterId())
                .sub1CharacterId(responseQuery.getSub1CharacterId())
                .sub2CharacterId(responseQuery.getSub2CharacterId())
                .build();
    }
}