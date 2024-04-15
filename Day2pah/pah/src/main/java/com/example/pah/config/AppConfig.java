package com.example.pah.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Value("${student.name}")
    private String studentName;
    @Value("${student.dept}")
    private String studentDepartment;
    public String getstudentName() {
        return studentName;
    }
    public String getstudentdept() {
        return studentDepartment;
    }
    
}
