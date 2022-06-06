package com.example.demojsp.config;

import com.example.demojsp.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Employee employee(){
        Employee employee = new Employee();
        employee.setUserName("小明");
        return employee;
    }
}
