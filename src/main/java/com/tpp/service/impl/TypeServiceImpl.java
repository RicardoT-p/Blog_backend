package com.tpp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.entity.Type;
import com.tpp.mapper.TypeMapper;
import com.tpp.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

    @Autowired
    TypeMapper typeMapper;

    @Override
    public int addOne(Type type) {
        return typeMapper.insert(type);
    }

    @Override
    public int updateOne(Type type) {
        return typeMapper.updateById(type);
    }

    @Override
    public int deleteOne(String id) {
        return typeMapper.deleteById(id);
    }
}
