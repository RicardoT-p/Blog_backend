package com.tpp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tpp.entity.Blog;
import com.tpp.entity.Comment;
import com.tpp.entity.Type;

import java.util.List;

public interface CommentService extends IService<Comment> {

    Comment getComment(Long id);

    List<Comment> getCommentList();

    List<Comment> listCommentByPage(int pageNum, int pageSize);

    int addOne(Comment comment);

    int updateOne(Comment comment);

    int deleteOne(String id);
}
