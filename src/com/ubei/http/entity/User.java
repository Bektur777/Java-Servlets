package com.ubei.http.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    Integer id;
    String name;
    String image;
    LocalDate birthday;
    String email;
    String password;
    Role role;
    Gender gender;
}
