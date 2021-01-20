package com.example.smabro_app.infrastructure.mapper;

import com.example.smabro_app.domain.model.Users;
import com.example.smabro_app.domain.model.UsersExample;
import com.example.smabro_app.infrastructure.model.request.UserRequestQuery;
import com.example.smabro_app.infrastructure.model.response.UserResponseQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsersMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(UsersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(UsersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    UserResponseQuery insert(UserRequestQuery record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Users record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Users> selectByExample(UsersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Users selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Users record);
}