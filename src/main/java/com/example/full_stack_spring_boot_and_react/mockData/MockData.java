package com.example.full_stack_spring_boot_and_react.mockData;

import com.example.full_stack_spring_boot_and_react.student.Gender;
import com.example.full_stack_spring_boot_and_react.student.Student;
import com.example.full_stack_spring_boot_and_react.student.internal.Car;
import com.example.full_stack_spring_boot_and_react.student.internal.Person;
import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MockData {

    public static List<Person> getPeople() throws IOException {
        InputStream inputStream = Resources.getResource("mockData/people.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Person>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }

    public static List<Car> getCars() throws IOException {
        InputStream inputStream = Resources.getResource("mockData/cars.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Car>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }

    public static List<Student> getStudents() {
        return List.of(
          new Student(2l, "Bill", "g@gmai.com", Gender.UNKNOWN),
          new Student(1l, "Kim", "k@gmail.com", Gender.FEMALE)
        );
    }

}
