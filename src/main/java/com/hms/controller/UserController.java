package com.hms.controller;

import com.hms.model.User;
import com.hms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users/add")
    public User saveUser(@RequestBody User user){

        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> fatchUserList(){

        return userService.fatchUserList();
    }

    @GetMapping("/users/{id}")
    public User fatchUser(@PathVariable ("id") int userId){

        return userService.fatchUserById(userId);
    }

    @DeleteMapping(path = "/users/delete/{id}")
    public @ResponseBody String deleteUserById(@PathVariable int id){
        userService.deleteUserById(id);
        return "Record deleted";
    }

    @PutMapping(path = "users/update/{id}")
    public @ResponseBody User updateUserById(@PathVariable int id, @RequestBody User user){
        return userService.updateUserById(id, user);
    }
}
