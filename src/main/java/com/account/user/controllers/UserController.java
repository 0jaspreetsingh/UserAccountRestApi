package com.account.user.controllers;


import com.account.user.Dto.UserDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin()
@RequestMapping(value = "/api/user")
public interface UserController {

    /**
     * @return
     */
    @GetMapping
    public List<UserDto> getAllUsers();

    /**
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public UserDto getById(@PathVariable long id);

    /**
     * @param user
     * @return
     */
    @PostMapping
    public UserDto createUser(@Valid @RequestBody UserDto user);


    /**
     * @param user
     * @return
     */
    @PutMapping
    public UserDto updateUser(@Valid @RequestBody UserDto user);

    /**
     * @param id
     */
    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable long id);
}
