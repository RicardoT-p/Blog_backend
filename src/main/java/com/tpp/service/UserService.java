package com.tpp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tpp.entity.Blog;
import com.tpp.entity.User;

public interface UserService extends IService<User> {
    boolean checkUsername(String username);

    User checkUser(String username,String password);

    int addOne(User user);

    int updateOne(User user);

    int deleteOne(String id);
}
