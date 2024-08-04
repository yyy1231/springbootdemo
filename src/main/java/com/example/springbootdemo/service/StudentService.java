package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<Student> selectStu(Integer sno,String sname,String ssex);

    String insertStudent(Student student);

    Student getStuById(Integer sno);

    List<Student> selectStudent(Map<String, Object> map);
}
