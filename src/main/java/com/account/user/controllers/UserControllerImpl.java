package com.account.user.controllers;

import com.account.user.Dto.UserDto;
import com.account.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserControllerImpl implements UserController {

    @Autowired
    UserService userService;

    @Override
    public List<UserDto> getAllUsers() {
        return new ArrayList<>();
    }

    @Override
    public UserDto getById(long id) {
        return new UserDto();
    }

    @Override
    public UserDto createUser(UserDto user) {
        return this.userService.addUser(user);
    }

    @Override
    public UserDto updateUser(UserDto user) {
        return new UserDto();
    }

    @Override
    public void deleteUser(long id) {
        return;
    }
}
