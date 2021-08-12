package com.tpp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.dao.BlogRepository;
import com.tpp.entity.Blog;
import com.tpp.mapper.BlogMapper;
import com.tpp.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

    @Autowired
    BlogMapper blogMapper;

    @Autowired
    BlogRepository blogRepository;

    @Override
    public Blog getByTitle(String title) {
        LambdaQueryWrapper<Blog> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Blog::getTitle,title);
        return blogMapper.selectOne(queryWrapper);
    }

    @Override
    public Blog getBlog(Long id) {
        return blogMapper.selectById(id);
    }

    @Override
    public List<Blog> getBlogeList() {
        LambdaQueryWrapper<Blog> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Blog::getDeletionFlag, 0)
                .orderByDesc(Blog::getCreationTime);
        return blogMapper.selectList(queryWrapper);
    }

    @Override
    public Page<Blog> listBlogByPage(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public int addOne(Blog blog) {
        return blogMapper.insert(blog);
    }

    @Override
    public int updateOne(Blog blog) {
        return blogMapper.updateById(blog);
    }

    @Override
    public int deleteOne(Long id) {
        return blogMapper.deleteById(id);
    }
}
