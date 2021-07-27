package com.tpp.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: blog_backend
 * @Package: com.tpp.entity
 * @ClassName: User
 * @Author: ptang
 * @Date: 2021/7/27 9:57 下午
 */
@Data
public class User {

    private Long id;
    private String nickname;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Integer type;

    private Date createTime;

    private Date updateTime;

    private List<Blog> blogs = new ArrayList<>();
}