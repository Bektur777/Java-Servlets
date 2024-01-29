package com.ubei.http.service;

import com.ubei.http.dao.UserDao;
import com.ubei.http.dto.CreateUserDto;
import com.ubei.http.entity.User;
import com.ubei.http.exception.ValidationException;
import com.ubei.http.mapper.UserMapper;
import com.ubei.http.validator.CreateUserValidator;
import com.ubei.http.validator.ValidationResult;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserService {

    private static final UserService INSTANCE = new UserService();

    private final CreateUserValidator createUserValidator = CreateUserValidator.getInstance();
    private final UserDao userDao = UserDao.getInstance();
    private final UserMapper userMapper = UserMapper.getInstance();
    private final ImageService imageService = ImageService.getInstance();

    @SneakyThrows
    public Integer create(CreateUserDto userDto) {
        ValidationResult valid = createUserValidator.isValid(userDto);
        if (!valid.isValid()) {
            throw new ValidationException(valid.getErrors());
        }
        User user = userMapper.mapFrom(userDto);
        imageService.upload(user.getImage(), userDto.getImage().getInputStream());
        userDao.save(user);

        return user.getId();
    }

    public static UserService getInstance() {
        return INSTANCE;
    }
}
