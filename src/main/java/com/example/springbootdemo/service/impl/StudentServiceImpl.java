package com.example.springbootdemo.service.impl;


import com.example.springbootdemo.dao.StudentMapper;
import com.example.springbootdemo.entity.Student;
import com.example.springbootdemo.service.StudentService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.rmi.server.ServerNotActiveException;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectStu(Integer sno, String sname, String ssex) {
        return studentMapper.selectStu(sno,sname,ssex);
    }

    @Override
    public String insertStudent(Student student) {
        int i = studentMapper.insertStudent(student);
        return "新增成功" + i;
    }

    @Override
    public Student getStuById(Integer sno) {

        return studentMapper.getStuById(sno);
    }

    @Override
    public List<Student> selectStudent(Map<String, Object> map) {
        Integer sno = (Integer) map.get("sno");
        String sname = (String) map.get("sname");
        String ssex = (String) map.get("ssex");
        return studentMapper.selectStu(sno,sname,ssex);
    }
}
