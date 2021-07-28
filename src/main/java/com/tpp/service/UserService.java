package com.tpp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tpp.entity.Blog;
import com.tpp.entity.User;

public interface UserService extends IService<User> {
    int addOne(User user);

    int updateOne(User user);

    int deleteOne(String id);
}
