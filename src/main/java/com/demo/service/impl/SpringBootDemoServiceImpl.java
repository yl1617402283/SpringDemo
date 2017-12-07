package com.demo.service.impl;

import com.demo.mapper.UserMapper;
import com.demo.pojo.User;
import com.demo.service.SpringBootDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringBootDemoServiceImpl implements SpringBootDemoService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {

        return userMapper.getUserById(id);
    }
}
