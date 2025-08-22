package com.backend.Focus_Flow.controller;

import com.backend.Focus_Flow.model.User;
import com.backend.Focus_Flow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> userList(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable ("id") Long id){
        return userService.getUser(id);
    }

    @PutMapping("/update/user/{id}")
    public User updateUser(@PathVariable ("id") Long id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/user/{id}")
    public void deleteUser(@PathVariable ("id") Long id){
        userService.removeUser(id);
    }
}
