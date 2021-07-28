package com.tpp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tpp.entity.Blog;

public interface BlogService extends IService<Blog> {
    int addOne(Blog blog);

    int updateOne(Blog blog);

    int deleteOne(String id);
}
