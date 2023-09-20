package com.ziqi.web.entity;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;

    private String username;

    private String realname;

    private String password;

    private String IDcard;

    private String phone;

    private String email;

    private Integer paypwd;

    private Integer status;

    private String reputation;
}
