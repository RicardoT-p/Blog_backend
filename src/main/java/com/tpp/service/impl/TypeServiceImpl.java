package com.tpp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.tpp.dao.TypeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.entity.Type;
import com.tpp.mapper.TypeMapper;
import com.tpp.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

    @Autowired
    TypeMapper typeMapper;

    @Autowired
    TypeRepository typeRepository;

    @Override
    public Type getTypeByName(String typeName) {
        LambdaQueryWrapper<Type> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Type::getName,typeName);
        return typeMapper.selectOne(queryWrapper);
    }

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
    public Page<Type> listType(Pageable pageable) {
        return typeRepository.findAll(pageable);
    }

    @Override
    public List<Type> listTypeTop(Integer size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"blogs.size");
        Pageable pageable = PageRequest.of(0,size,sort);
        return typeRepository.findTop(pageable);
    }

    @Transactional
    @Override
    public int deleteOne(Long id) {
        return typeMapper.deleteById(id);
    }
}
