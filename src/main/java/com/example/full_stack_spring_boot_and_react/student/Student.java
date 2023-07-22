package com.example.full_stack_spring_boot_and_react.student;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    Long ID;
    String name;
    String email;
    Gender gender;

}
