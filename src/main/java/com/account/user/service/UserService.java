package com.account.user.service;


import com.account.user.Dto.UserDto;
import com.account.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    public UserDto getById(long id);

    public List<UserDto> getAllUsers();

    public UserDto addUser(UserDto user);

    public void deleteUser(long id);


}
