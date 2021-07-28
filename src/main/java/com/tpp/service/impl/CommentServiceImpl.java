package com.tpp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.entity.Comment;
import com.tpp.mapper.CommentMapper;
import com.tpp.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

    @Autowired
    CommentMapper commentMapper;

    @Override
    public int addOne(Comment comment) {
        return commentMapper.insert(comment);
    }

    @Override
    public int updateOne(Comment comment) {
        return commentMapper.updateById(comment);
    }

    @Override
    public int deleteOne(String id) {
        return commentMapper.deleteById(id);
    }
}
