package com.tpp.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tpp.entity.Blog;
import com.tpp.entity.Type;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService extends IService<Type> {

    Type getType(Long id);

    List<Type> getTypeList();

    List<Type> listTypeByPage(int pageNum, int pageSize);

    int addOne(Type type);

    int updateOne(Type type);

    int deleteOne(String id);
}
