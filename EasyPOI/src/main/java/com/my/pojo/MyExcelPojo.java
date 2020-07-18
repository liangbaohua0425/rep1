package com.my.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

public class MyExcelPojo implements Serializable {

    @Excel(name = "姓名")
    private String name;
    @Excel(name = "学校")
    private String school;
    @Excel(name = "年龄")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyExcelPojo{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", age=" + age +
                '}';
    }
}
