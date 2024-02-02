package com.ubei.http.mapper;

import com.ubei.http.dto.UserDto;
import com.ubei.http.entity.User;

public class UserMapper implements Mapper<User, UserDto> {

    public static final UserMapper INSTANCE = new UserMapper();

    @Override
    public UserDto mapFrom(User object) {
        return UserDto.builder()
                .name(object.getName())
                .image(object.getImage())
                .email(object.getEmail())
                .gender(object.getGender())
                .birthday(object.getBirthday())
                .role(object.getRole())
                .build();
    }

    public static UserMapper getInstance() {
        return INSTANCE;
    }
}
