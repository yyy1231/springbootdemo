package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Student;
import com.example.springbootdemo.service.StudentService;
import com.example.springbootdemo.utils.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class StudentController {
    private final static Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Resource(name = "studentServiceImpl")
    private StudentService studentService;

    @RequestMapping(value = "/student/{sno}", method = RequestMethod.GET)
    public Student getStuById(@PathVariable @Valid Integer sno) {
        logger.info("=======测试日志打印===========");
        return studentService.getStuById(sno);
    }

//    @RequestMapping(value = "/student1", method = RequestMethod.GET)
//    public Student getStuById(Integer sno) {
//        logger.info("=======测试日志打印===========");
//        return studentService.getStuById(sno);
//    }

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public List<Student> selectStu(@RequestParam(required = false) Integer sno,
                                   @RequestParam(required = false) String sname,
                                   @RequestParam(required = false) String ssex){
        return studentService.selectStu(sno,sname,ssex);
    }

    @RequestMapping(value = "/student/all",method = RequestMethod.POST)
    public List<Student> selectStudent(@RequestBody Map<String,Object> map){
        return studentService.selectStudent(map);
    }

    @PostMapping(value = "/student")
    public ResultVO<String> insertStudent(@RequestBody @Valid Student student){
        return new ResultVO<>(studentService.insertStudent(student));
    }

    @RequestMapping(value = "/array",method = RequestMethod.GET)
    public String getArray(String[] name) {
        String str = Arrays.toString(name);
        return str;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String getList(@RequestParam List<String> name) {
        logger.info("=======测试日志打印===========");
        System.out.println(name);
        return name.toString();
    }
}
