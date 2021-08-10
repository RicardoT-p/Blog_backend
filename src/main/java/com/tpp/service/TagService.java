package com.tpp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tpp.entity.Blog;
import com.tpp.entity.Tag;
import com.tpp.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService extends IService<Tag> {

    Tag getTagByName(String tagName);

    Tag getTag(Long id);

    List<Tag> getTagList();

    Page<Tag> listTag(Pageable pageable);

    int addOne(Tag tag);

    int updateOne(Tag tag);

    int deleteOne(Long id);
}
