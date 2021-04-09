package com.account.user.service;


import com.account.user.Dto.UserDto;
import com.account.user.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


    public UserDto getById(long id);

    public UserDto addUser(UserDto user);


}
