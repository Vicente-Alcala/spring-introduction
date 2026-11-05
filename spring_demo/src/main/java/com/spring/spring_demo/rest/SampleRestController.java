package com.spring.spring_demo.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import com.spring.spring_demo.Student;

@RestController
public class SampleRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // define a private field for the dependency
    private Student myStudent;
    private Student anotherStudent;

    public SampleRestController(@Qualifier("elementaryStudent")
                                Student student) {
        myStudent = student;
    }

    @GetMapping("/check")
    public String checkScope() {
        return "myStudent == anotherStudent? " + (myStudent == anotherStudent);
    }

    @GetMapping("/assignment")
    public String getAssignment() {
        return myStudent.getDailyAssignment();
    }
}
