package com.example.full_stack_spring_boot_and_react.student;

import com.example.full_stack_spring_boot_and_react.mockData.MockData;
import com.example.full_stack_spring_boot_and_react.student.internal.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public ResponseEntity<List<Student>> getAllPeople() throws IOException {
        return new ResponseEntity<>(MockData.getStudents(), HttpStatus.OK);
    }
    @PostMapping
    public void addStudent(@RequestBody Student student) {
//        studentService.addStudent(student);
    }

    @DeleteMapping(path = "/{studentId}")
    public void deleteStudent(
            @PathVariable("studentId") Long studentId) {
//        studentService.deleteStudent(studentId);
    }

}
