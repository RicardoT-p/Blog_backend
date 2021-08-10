package com.tpp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tpp.entity.Blog;
import com.tpp.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService extends IService<Type> {

    Type getTypeByName(String typeName);

    Type getType(Long id);

    List<Type> getTypeList();

    Page<Type> listType(Pageable pageable);

    List<Type> listTypeTop(Integer size);

    int deleteOne(Long id);
}
