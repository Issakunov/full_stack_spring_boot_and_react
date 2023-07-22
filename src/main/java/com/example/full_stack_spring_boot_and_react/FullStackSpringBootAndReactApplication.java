package com.example.full_stack_spring_boot_and_react;

import com.example.full_stack_spring_boot_and_react.mockData.MockData;
import com.example.full_stack_spring_boot_and_react.student.internal.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class FullStackSpringBootAndReactApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(FullStackSpringBootAndReactApplication.class, args);

	}

}
