package com.tpp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tpp.entity.Blog;
import com.tpp.entity.Tag;

public interface TagService extends IService<Tag> {
    int addOne(Tag tag);

    int updateOne(Tag tag);

    int deleteOne(String id);
}
