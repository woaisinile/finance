package com.ziqi.web.controller;

import com.ziqi.web.common.result.Result;
import com.ziqi.web.entity.User;
import com.ziqi.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/qryAllUser")
    public Result qryAllUser(@RequestBody Map<String, Object> qryObj){
        List<User> allUser = userService.qryAllUser(qryObj);
       return Result.ok(allUser);
    }

    @PostMapping("/deleteUserById")
    public Result deleteUserById(@RequestBody Map<String, Object> qryObj){
        Integer deleteCount = userService.deleteUserById((Map<String, Object>) qryObj.get("params"));
        return Result.ok(deleteCount);
    }
}
