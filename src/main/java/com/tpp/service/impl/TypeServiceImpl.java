package com.tpp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.entity.Type;
import com.tpp.mapper.TypeMapper;
import com.tpp.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

    @Autowired
    TypeMapper typeMapper;


    @Override
    public Type getType(Long id) {
        return typeMapper.selectById(id);
    }

    @Override
    public List<Type> getTypeList() {
        LambdaQueryWrapper<Type> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Type::getDeletionFlag, 0)
                .orderByDesc(Type::getCreationTime);
        return typeMapper.selectList(queryWrapper);
    }


    @Override
    public List<Type> listTypeByPage(int pageNum, int pageSize) {
        IPage<Type> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<Type> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Type::getDeletionFlag, 0)
                .orderByDesc(Type::getCreationTime);
        return typeMapper.selectPage(page,queryWrapper).getRecords();
    }


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
