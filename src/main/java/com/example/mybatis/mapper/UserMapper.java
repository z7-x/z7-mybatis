package com.example.mybatis.mapper;

import com.example.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname UserMapper
 * @Description TODO
 * @Date 2021/2/7 10:49 上午
 * @Author z7-x
 */
@Mapper
public interface UserMapper {

    int addUser(User user);

    int removeUser(Long id);

    int updateUser(User user);

    User findUserById(Long id);

    List<User> findAll();

    /**
     * 用户角色列表
     */
    List<User> getUserRoleList();
}
