package com.tpp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.entity.Tag;
import com.tpp.entity.Type;
import com.tpp.mapper.TagMapper;
import com.tpp.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

    @Autowired
    TagMapper tagMapper;

    @Override
    public Tag getTag(Long id) {
        return tagMapper.selectById(id);
    }

    @Override
    public List<Tag> getTagList() {
        LambdaQueryWrapper<Tag> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Tag::getDeletionFlag, 0)
                .orderByDesc(Tag::getCreationTime);
        return tagMapper.selectList(queryWrapper);
    }

    @Override
    public List<Tag> listTagByPage(int pageNum, int pageSize) {
        IPage<Tag> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<Tag> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Tag::getDeletionFlag, 0)
                .orderByDesc(Tag::getCreationTime);
        return tagMapper.selectPage(page,queryWrapper).getRecords();
    }

    @Override
    public int addOne(Tag tag) {
        return tagMapper.insert(tag);
    }

    @Override
    public int updateOne(Tag tag) {
        return tagMapper.updateById(tag);
    }

    @Override
    public int deleteOne(String id) {
        return tagMapper.deleteById(id);
    }
}
