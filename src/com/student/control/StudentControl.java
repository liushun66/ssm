package com.student.control;

import com.student.pojo.Student;
import com.student.service.StudentService;
import com.student.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2018-04-12.
 */
@Controller
public class StudentControl {
    @Autowired StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
    @RequestMapping("/index")
    public String SelectStudent(Model model, String pageNo, String pageSize){
        Page page=new Page();
        page.setPageSize(2);
        page.setTotaCount(studentService.getCont());
        int totapage=page.getTotaCount()%page.getPageSize()==0?page.getTotaCount()/page.getPageSize()
                :page.getTotaCount()/page.getPageSize()+1;
        page.setTotalPageNo(totapage);
        if(pageNo==null){
            page.setCurrPageNo(1);
        }else{
            page.setCurrPageNo(Integer.parseInt(pageNo));
        }
        Map<String,Object> map=new HashMap<>();
        map.put("pageNo",(page.getCurrPageNo()-1)*page.getPageSize());
        map.put("pageSize", page.getPageSize());
        List<Student> list=studentService.selectStudent(map);
        page.setListStudent(list);
        model.addAttribute("page", page);
        return "index";
    }

    @RequestMapping("/delete")
    public String delete(String id){
        int count=studentService.delStudent(id);
        return "redirect:/index";
    }
    @RequestMapping("/add")
    public String adds(){
        return "addStudent";
    }

    @RequestMapping("/addstudent")
    public String add(Student student){
        int count=studentService.addStudent(student);
        return "redirect:/index";
    }

    @RequestMapping("/selectupdate")
    public String selectupdate(Model model,String id){
        Student student=studentService.updateSelect(id);
        model.addAttribute("student", student);
        return "updateStudent";
    }

    @RequestMapping("/update")
    public String update(Student student){
        int count=studentService.updateStudent(student);
        return "redirect:/index";
    }
}
