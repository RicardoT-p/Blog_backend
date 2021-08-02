package com.tpp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
@EqualsAndHashCode(callSuper = true)
@Data
public class User extends Base{
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private Long blogId;
    private String nickname;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Integer type;
//
//    private List<Blog> blogs = new ArrayList<>();
}