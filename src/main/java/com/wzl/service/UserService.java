package com.wzl.service;

import com.wzl.entity.User;
import com.wzl.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;


public interface UserService {

    /**
     * 通过id查询用户
     *
     * @param id
     * @return
     * @throws Exception
     */
    User getUserById(int id) throws Exception;

    /**
     *通过名字模糊搜索得到用户集
     *
     * @param  username
     * @return
     * @throws Exception
     */
    List<User> getUsersByUsername(String username) throws SQLException;

    /**
     * 插入User
     *
     * @param username
     * @param password
     * @return
     * @throws SQLException
     */
    int addUser(String username,String password) throws SQLException;

    /**
     * 根据编号删除缓存
     *
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteUser(int id) throws SQLException;




}
