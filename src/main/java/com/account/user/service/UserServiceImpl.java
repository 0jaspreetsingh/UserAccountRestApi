package com.account.user.service;

import com.account.user.Dto.UserDto;
import com.account.user.entity.User;
import com.account.user.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto getById(long id) {
        User user = this.userRepository.getOne(id);
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return userDto;
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = this.userRepository.findAll();
        List<UserDto> userDtos = users.stream().map(user -> modelMapper.map(user, UserDto.class)
        ).collect(Collectors.toList());
        return userDtos;
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        user = this.userRepository.save(user);
        userDto.setId(user.getId());
        return userDto;
    }

    @Override
    public void deleteUser(long id) {
        this.userRepository.deleteById(id);
    }


}
