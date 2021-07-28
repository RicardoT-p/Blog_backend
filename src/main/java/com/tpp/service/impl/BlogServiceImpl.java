package com.tpp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.entity.Blog;
import com.tpp.mapper.BlogMapper;
import com.tpp.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

    @Autowired
    BlogMapper blogMapper;

    @Override
    public int addOne(Blog blog) {
        return blogMapper.insert(blog);
    }

    @Override
    public int updateOne(Blog blog) {
        return blogMapper.updateById(blog);
    }

    @Override
    public int deleteOne(String id) {
        return blogMapper.deleteById(id);
    }
}
