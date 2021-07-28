package com.tpp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.entity.Tag;
import com.tpp.mapper.TagMapper;
import com.tpp.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

    @Autowired
    TagMapper tagMapper;

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
