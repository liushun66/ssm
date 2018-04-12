package com.student.service.impl;

import com.student.dao.StudentMapper;
import com.student.pojo.Grade;
import com.student.pojo.Student;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2018-04-12.
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public List<Student> selectStudent(Map<String, Object> map) {
        return studentMapper.selectStudent(map);
    }

    @Override
    public int getCont() {
        return studentMapper.getCont();
    }

    @Override
    public List<Grade> selectGrade() {
        return studentMapper.selectGrade();
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int delStudent(String id) {
        return studentMapper.delStudent(id);
    }

    @Override
    public Student updateSelect(String id) {
        return studentMapper.updateSelect(id);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }
}
