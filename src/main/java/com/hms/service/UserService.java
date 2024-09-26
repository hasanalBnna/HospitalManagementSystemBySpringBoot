package com.hms.service;

import com.hms.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    List<User> fatchUserList();

    User fatchUserById(int userId);

    void deleteUserById(int id);

    User updateUserById(int id, User user);
}
