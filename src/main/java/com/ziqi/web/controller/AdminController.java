package com.ziqi.web.controller;

import com.ziqi.web.common.result.Result;
import com.ziqi.web.entity.Admin;
import com.ziqi.web.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/adminLogin")
    public Result adminLogin(@RequestParam("username") String username,
                             @RequestParam("password") String password){
        Map<String, Object> qryMap = new HashMap<>();
        qryMap.put("username", username);
        qryMap.put("password", password);
        Admin admin = adminService.qryAdmin(qryMap);
        if (null != admin) {
            return Result.ok(admin);
        }
        return Result.fail("登录失败");
    }

}
