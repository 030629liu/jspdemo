package com.example.demojsp;

import com.example.demojsp.config.JavaConfig;
import com.example.demojsp.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class DemojspApplicationTests {

    @Test
    void contextLoads() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        Employee employee = (Employee)context.getBean("employee");
        System.out.print(employee.toString());
    }

}
