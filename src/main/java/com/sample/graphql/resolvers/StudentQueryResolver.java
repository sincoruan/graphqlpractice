package com.sample.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sample.graphql.modal.Student;
import com.sample.graphql.service.StudentService;
import graphql.GraphQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentQueryResolver implements GraphQLQueryResolver
{
    @Autowired
    private StudentService studentService;

    public Student student (String name) {
        if(name == null) {
            throw new RuntimeException("name can't be null");
        }
        return studentService.getStudentDetailsByName(name);
    }
}
