package com.account.user.service;

import com.account.user.Dto.UserDto;
import com.account.user.entity.User;
import com.account.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto getById(long id) {
        User user = this.userRepository.getOne(id);
        return null;
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setAddress(userDto.getAddress());
        user.setPhone(userDto.getPhone());
        user.setDepartment(userDto.getDepartment());
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        user.setCountry(userDto.getCountry());
        this.userRepository.save(user);
        return userDto;
    }


}
