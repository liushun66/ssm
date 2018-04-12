package com.student.dao;

import com.student.pojo.Grade;
import com.student.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2018-04-12.
 */
public interface StudentMapper {
    //查询分页
    public List<Student> selectStudent(Map<String,Object> map);
    //获取总数
    public int getCont();
    //查询年级
    public List<Grade> selectGrade();
    //新增
    public int addStudent(Student student);
    //删除
    public  int delStudent(String id);
    //修改用的查询
    public  Student updateSelect(String id);
    //修改
    public int updateStudent(Student student);

}
