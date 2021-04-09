package com.account.user.controllers;


import com.account.user.Dto.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public interface UserController {

    /**
     * @return
     */
    @GetMapping
    public List<User> getAllUsers();

    /**
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public User getById(@PathVariable String id);

    /**
     * @param user
     * @return
     */
    @PostMapping
    public User createUser(User user);


    /**
     * @param user
     * @return
     */
    @PutMapping
    public User updateUser(User user);

    /**
     * @param id
     */
    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable String id);
}
