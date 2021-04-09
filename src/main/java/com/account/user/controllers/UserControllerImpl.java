package com.account.user.controllers;

import com.account.user.Dto.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserControllerImpl implements UserController {
    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>();
    }

    @Override
    public User getById(String id) {
        return new User();
    }

    @Override
    public User createUser(User user) {
        return new User();
    }

    @Override
    public User updateUser(User user) {
        return new User();
    }

    @Override
    public void deleteUser(String id) {
        return;
    }
}
