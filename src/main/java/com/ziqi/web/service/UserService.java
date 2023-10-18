package com.ziqi.web.service;

import com.ziqi.web.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> qryAllUser(Map<String, Object> qryObj);

    Integer deleteUserById(Map<String, Object> qryObj);

    Integer updateUserById(Map<String, Object> params);
}
