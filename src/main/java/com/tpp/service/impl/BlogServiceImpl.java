package com.tpp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.entity.Blog;
import com.tpp.mapper.BlogMapper;
import com.tpp.service.BlogService;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {
    @Override
    public int addOne(Blog blog) {
        return 0;
    }

    @Override
    public int updateOne(Blog blog) {
        return 0;
    }

    @Override
    public int deleteOne(String id) {
        return 0;
    }
}
