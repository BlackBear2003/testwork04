package com.wzl.service.Impl;

import com.github.pagehelper.PageHelper;
import com.wzl.entity.User;
import com.wzl.mapper.UserMapper;
import com.wzl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {




    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserById(int id) throws Exception {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUsersByUsername(String username) throws SQLException {
        return userMapper.getUsersByUsername(username);
    }

    @Override
    public int addUser(String username,String password) throws SQLException {
        User user=new User(0,username,password);
        int val=userMapper.addUser(user);
        //System.out.println(user.getId());
        //System.out.println(val);
        return user.getId();
    }

    @Override
    public int deleteUser(int id) throws SQLException {
        return userMapper.deleteUser(id);
    }
}
