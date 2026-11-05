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
    

    // public SampleRestController(Student theStudent) {
    // myStudent = theStudent;
    // }

    // public SampleRestController(@Qualifier("universityStudent") Student student,
    //                             @Qualifier ("universityStudent") Student student_two) {
    //     myStudent = student;
    //     anotherStudent = student_two;
    // }

    public SampleRestController(@Qualifier("elementaryStudent") Student student) {
        myStudent = student;
    }

    @GetMapping("/check")
    public String checkScope() {
        return "myStudent == anotherStudent? " + (myStudent == anotherStudent);
    }
    
    // @Autowired
    // public void setStudent(Student theStudent) {
    // myStudent = theStudent;
    // }

    // @Autowired
    // public void setStudent(@Qualifier("universityStudent") Student student) {
    //     myStudent = student;
    // }

    @GetMapping("/assignment")
    public String getAssignment() {
        return myStudent.getDailyAssignment();
    }
}
