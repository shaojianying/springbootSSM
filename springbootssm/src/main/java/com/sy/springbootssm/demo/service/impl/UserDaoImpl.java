package com.sy.springbootssm.demo.service.impl;

import com.sy.springbootssm.demo.mapper.UserMapper;
import com.sy.springbootssm.demo.pojo.User;
import com.sy.springbootssm.demo.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserMapper um;
    @Override
    public List<User> getuser() {
        return um.getuser();
    }
}
