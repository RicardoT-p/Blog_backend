package com.tpp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tpp.entity.Blog;
import com.tpp.entity.Comment;

public interface CommentService extends IService<Comment> {
    int addOne(Comment comment);

    int updateOne(Comment comment);

    int deleteOne(String id);
}
