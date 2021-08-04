package com.tpp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tpp.entity.Blog;
import com.tpp.entity.Tag;
import com.tpp.entity.Type;

import java.util.List;

public interface TagService extends IService<Tag> {

    Tag getTag(Long id);

    List<Tag> getTagList();

    List<Tag> listTagByPage(int pageNum, int pageSize);

    int addOne(Tag tag);

    int updateOne(Tag tag);

    int deleteOne(String id);
}
