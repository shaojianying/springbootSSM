package com.sy.springbootssm.demo.controller;

import com.sy.springbootssm.demo.pojo.User;
import com.sy.springbootssm.demo.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//User处理器
@Controller
public class UserController {
    @Autowired//自动装配
    private UserDao jk;//接口对象
    @RequestMapping("getUser")
    public ModelAndView adduser(){//获得所有用户
        List<User> lis =jk.getuser();
        ModelAndView mv=new ModelAndView();
        mv.addObject("userList",lis );
        mv.setViewName("alluser");
        return mv;
    }
}
