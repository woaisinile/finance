package com.ziqi.web.service.impl;

import com.ziqi.web.entity.Admin;
import com.ziqi.web.mapper.AdminMapper;
import com.ziqi.web.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin qryAdmin(Map<String, Object> qryMap) {
        return adminMapper.selectAdmin(qryMap);
    }
}
