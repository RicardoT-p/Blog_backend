package com.tpp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tpp.entity.Blog;
import com.tpp.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService extends IService<Blog> {
    Blog getByTitle(String title);

    Blog getBlog(Long id);

    List<Blog> getBlogeList();

    Page<Blog> listBlogByPage(Pageable pageable);

    int addOne(Blog blog);

    int updateOne(Blog blog);

    int deleteOne(Long id);
}
