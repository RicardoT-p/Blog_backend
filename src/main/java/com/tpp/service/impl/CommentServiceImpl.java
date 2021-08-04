package com.tpp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.entity.Blog;
import com.tpp.entity.Comment;
import com.tpp.mapper.CommentMapper;
import com.tpp.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

    @Autowired
    CommentMapper commentMapper;

    @Override
    public Comment getComment(Long id) {
        return commentMapper.selectById(id);
    }

    @Override
    public List<Comment> getCommentList() {
        LambdaQueryWrapper<Comment> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Comment::getDeletionFlag, 0)
                .orderByDesc(Comment::getCreationTime);
        return commentMapper.selectList(queryWrapper);
    }

    @Override
    public List<Comment> listCommentByPage(int pageNum, int pageSize) {
        IPage<Comment> page = new Page<>(pageNum,pageSize);
        LambdaQueryWrapper<Comment> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Comment::getDeletionFlag,0)
                    .orderByDesc(Comment::getCreationTime);
        return commentMapper.selectPage(page,queryWrapper).getRecords();
    }

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
