package com.ashish.student_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/getStudents")
    public List<studentInfo> studentInfoList(){
        return studentRepo.findAll();
    }

    @RequestMapping("/addStudent")
    public String add(){
        studentInfo studentInfo = new studentInfo();
        studentInfo.setName("Akshay");
        studentInfo.setEmail("akshay21@gmail.com");
        studentRepo.save(studentInfo);
        return "Data saved successfully...!";
    }
}
