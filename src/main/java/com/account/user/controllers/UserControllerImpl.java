package com.account.user.controllers;

import com.account.user.Dto.UserDto;
import com.account.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllerImpl implements UserController {

    @Autowired
    UserService userService;

    @Override
    public List<UserDto> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @Override
    public UserDto getById(long id) {
        return this.userService.getById(id);
    }

    @Override
    public UserDto createUser(UserDto user) {
        return this.userService.addUser(user);
    }

    @Override
    public UserDto updateUser(UserDto user) {
        return this.userService.addUser(user);
    }

    @Override
    public void deleteUser(long id) {
        this.userService.deleteUser(id);
    }
}
