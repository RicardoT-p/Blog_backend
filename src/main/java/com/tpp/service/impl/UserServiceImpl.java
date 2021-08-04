package com.tpp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tpp.entity.User;
import com.tpp.mapper.UserMapper;
import com.tpp.service.UserService;
import com.tpp.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> getUserList() {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getDeletionFlag,0)
                    .orderByDesc(User::getCreationTime);
        return userMapper.selectList(queryWrapper);
    }

    @Override
    public boolean checkUsername(String username) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,username);
        User user = userMapper.selectOne(queryWrapper);
        return user != null;
    }

    @Override
    public User checkUser(String username, String password) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,username)
                    .eq(User::getPassword, MD5Utils.code(password));
        return userMapper.selectOne(queryWrapper);
    }

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
