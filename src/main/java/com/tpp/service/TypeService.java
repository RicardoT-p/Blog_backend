package com.tpp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tpp.entity.Blog;
import com.tpp.entity.Type;

public interface TypeService extends IService<Type> {
    int addOne(Type type);

    int updateOne(Type type);

    int deleteOne(String id);
}
