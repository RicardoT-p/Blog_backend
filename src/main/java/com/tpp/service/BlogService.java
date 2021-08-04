package com.tpp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tpp.entity.Blog;
import com.tpp.entity.Type;

import java.util.List;

public interface BlogService extends IService<Blog> {

    Blog getBlog(Long id);

    List<Blog> getBlogeList();

    List<Blog> listBlogByPage(int pageNum, int pageSize);

    int addOne(Blog blog);

    int updateOne(Blog blog);

    int deleteOne(String id);
}
