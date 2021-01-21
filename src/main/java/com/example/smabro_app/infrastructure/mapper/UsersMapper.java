package com.example.smabro_app.infrastructure.mapper;

import com.example.smabro_app.infrastructure.model.request.UserRequestQuery;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {

    int insert(UserRequestQuery record);
}