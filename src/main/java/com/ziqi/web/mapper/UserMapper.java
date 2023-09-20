package com.ziqi.web.mapper;

import com.ziqi.web.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserMapper {
    List<User> selectAllUser(Map<String, Object> qryObj);
}
