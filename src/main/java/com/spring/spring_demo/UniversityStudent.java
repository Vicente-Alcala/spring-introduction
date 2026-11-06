package com.spring.spring_demo;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component 
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UniversityStudent implements Student {

    public UniversityStudent() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override 
    public String getDailyAssignment() {
        return "Study Spring Boot Coding (University Student)";
    }
}
