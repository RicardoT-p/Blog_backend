package com.tpp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.entity.Blog;
import com.tpp.entity.Type;
import com.tpp.mapper.BlogMapper;
import com.tpp.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

    @Autowired
    BlogMapper blogMapper;

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
    public List<Blog> listBlogByPage(int pageNum, int pageSize) {
        IPage<Blog> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<Blog> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Blog::getDeletionFlag, 0)
                .orderByDesc(Blog::getCreationTime);
        return blogMapper.selectPage(page,queryWrapper).getRecords();
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
    public int deleteOne(String id) {
        return blogMapper.deleteById(id);
    }
}
