package com.sy.springbootssm.demo.mapper;

import com.sy.springbootssm.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> getuser();//获得所有用户方法
}
