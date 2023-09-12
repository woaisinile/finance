package com.ziqi.web.service;

import com.ziqi.web.entity.Admin;

import java.util.Map;

public interface AdminService {
    Admin qryAdmin(Map<String, Object> qryMap);
}
