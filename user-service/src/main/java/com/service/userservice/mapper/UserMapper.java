package com.service.userservice.mapper;

import com.service.userservice.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from tb_user where id = #{id}")
    User selectByPrimaryKey(@Param("id") Long id);
}