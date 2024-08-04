package com.example.springbootdemo.service.impl;


import com.example.springbootdemo.dao.StudentMapper;
import com.example.springbootdemo.entity.Student;
import com.example.springbootdemo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl02 implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectStu(Integer sno, String sname, String ssex) {
        return null;
    }

    @Override
    public String insertStudent(Student student) {
        int i = studentMapper.insertStudent(student);
        return "新增成功" + i;
    }

    @Override
    public Student getStuById(Integer sno) {
        return null;
    }

    @Override
    public List<Student> selectStudent(Map<String, Object> map) {
        return null;
    }
}
