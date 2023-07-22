package com.example.full_stack_spring_boot_and_react.student.internal;

import lombok.Data;

@Data
public class Person {

    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String gender;
    private final Integer age;

}
