package com.tpp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.entity.User;
import com.tpp.mapper.UserMapper;
import com.tpp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int addOne(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateOne(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public int deleteOne(String id) {
        return userMapper.deleteById(id);
    }
}
