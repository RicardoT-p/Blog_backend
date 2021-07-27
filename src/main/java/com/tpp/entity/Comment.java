package com.tpp.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: blog_backend
 * @Package: com.tpp.entity
 * @ClassName: Comment
 * @Author: ptang
 * @Date: 2021/7/27 9:56 下午
 */

@Data
public class Comment {

    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String avatar;

    private Date createTime;


    private Blog blog;


    private List<Comment> replyComments = new ArrayList<>();


    private Comment parentComment;

    private boolean adminComment;
}