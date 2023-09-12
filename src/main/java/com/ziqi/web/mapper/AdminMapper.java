package com.ziqi.web.mapper;

import com.ziqi.web.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface AdminMapper {

    Admin selectAdmin(Map<String, Object> qryMap);

}
