package com.tpp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.entity.Comment;
import com.tpp.mapper.CommentMapper;
import com.tpp.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {
}
