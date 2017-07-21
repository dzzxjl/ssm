package com.dzzxjl.service.impl;

import com.dzzxjl.pojo.User;

import java.util.List;

/**
 * Created by dzzxjl on 2017/7/18.
 */
public interface IUserServiceImpl {
    public User getUserById(int userId);
    public void addUser(User user);
    public List<User> getAllUsers();
    public void deleteUser(int userId);
}