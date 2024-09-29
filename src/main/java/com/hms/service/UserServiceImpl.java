package com.hms.service;

import com.hms.model.User;
import com.hms.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {

        return userRepo.save(user);
    }

    @Override
    public List<User> fatchUserList() {

        return userRepo.findAll();
    }

    @Override
    public User fatchUserById(int userId) {

        return userRepo.findById(userId).get();
    }

    @Override
    public void deleteUserById(int id) {

        userRepo.deleteById(id);
    }

    @Override
    public User updateUserById(int id, User user) {
        User userToUpdate = userRepo.findById(id).get();

        if(Objects.nonNull(user.getFullName()) && !"".equalsIgnoreCase(user.getFullName())) {
            userToUpdate.setFullName(user.getFullName());
        }
//        user.getAge()>0
//Objects.nonNull(user.getAge()) && !"".equalsIgnoreCase(String.valueOf(user.getAge())) //works for integer or string but not short data type
        else if(user.getAge()>0) {
            userToUpdate.setAge(user.getAge());
        }

        return userRepo.save(userToUpdate);
    };
}

