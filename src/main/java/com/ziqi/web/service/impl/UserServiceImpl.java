package com.ziqi.web.service.impl;

import com.ziqi.web.entity.User;
import com.ziqi.web.mapper.UserMapper;
import com.ziqi.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> qryAllUser(Map<String, Object> qryObj) {
        return userMapper.selectAllUser(qryObj);
    }
}
