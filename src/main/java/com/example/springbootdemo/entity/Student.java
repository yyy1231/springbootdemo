package com.example.springbootdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Data
public class Student {
    @NotNull(message = "sno不可以为空")
    private int sno;

    @NotBlank(message = "sname不可以为空")
    private String sname;

    @NotBlank(message = "ssex不可以为空")
    private String ssex;

    private Date sbirthday;
    private String clazz;
}
