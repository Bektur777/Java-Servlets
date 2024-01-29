package com.ubei.http.mapper;

import com.ubei.http.dto.CreateUserDto;
import com.ubei.http.entity.Gender;
import com.ubei.http.entity.Role;
import com.ubei.http.entity.User;
import com.ubei.http.util.LocalDateFormatter;

public class UserMapper implements Mapper<CreateUserDto, User> {

    public static final UserMapper userMapper = new UserMapper();

    @Override
    public User mapFrom(CreateUserDto object) {
        return User.builder()
                .name(object.getName())
                .email(object.getEmail())
                .gender(Gender.valueOf(object.getGender()))
                .birthday(LocalDateFormatter.format(object.getBirthday()))
                .role(Role.valueOf(object.getRole()))
                .password(object.getPassword())
                .build();
    }

    public static UserMapper getInstance() {
        return userMapper;
    }
}
