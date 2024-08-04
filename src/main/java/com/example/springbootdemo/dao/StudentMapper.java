package com.example.springbootdemo.dao;


import com.example.springbootdemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {
    int insertStudent(Student student);

    List<Student> selectStu(Integer sno, String sname, String ssex);

    Student getStuById(Integer sno);
}
