package com.sy.springbootssm.demo.service;

import com.sy.springbootssm.demo.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserDao {
    public List<User> getuser();//获得所有用户方法
}
