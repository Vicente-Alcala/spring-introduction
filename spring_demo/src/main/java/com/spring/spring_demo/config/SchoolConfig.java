package com.spring.spring_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.spring_demo.ElementaryStudent;
import com.spring.spring_demo.Student;

@Configuration 
public class SchoolConfig {

    @Bean("elementaryStudent")
    public Student elementaryStudent() {
        return new ElementaryStudent();
    }
}
