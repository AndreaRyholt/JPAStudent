package com.example.jpastudent.config;

import com.example.jpastudent.model.Student;
import com.example.jpastudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student();
        student1.setName("Bruce");
        student1.setBornDate(LocalDate.of(2010,11,12));
        student1.setBornTime(LocalTime.of(10,11,12));
    }


}
