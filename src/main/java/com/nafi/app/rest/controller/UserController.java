package com.nafi.app.rest.controller;
import com.nafi.app.rest.Entities.User;
import com.nafi.app.rest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String getPage(){
        return "Ki Obostha vaya?";
    }

    @GetMapping("/users")
    public List<User> getUsers(){
       return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getOneUser(@PathVariable long id)
    {
        return userService.getSingleUser(id);
    }

    @PutMapping("/users/{id}")
    public String updateOneUser(@PathVariable long id, @RequestBody User user)
    {
        user.setUserId(id);
        userService.updateUser(user);
        return "User Updated";
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user)
    {
        return userService.createNewUser(user);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable long id)
    {
        userService.deleteOneUser(id);
        return "Deleted :(";
    }


}
