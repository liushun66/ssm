package com.student.util;

import com.student.pojo.Student;

import java.util.List;

/**
 * Created by ASUS on 2018-04-12.
 */
public class Page {
    private int currPageNo;//当前页数
    private int pageSize;//页面大小
    private int totalPageNo;//总页数
    private int totaCount;//记录总数
    private List<Student> listStudent;

    public int getCurrPageNo() {
        return currPageNo;
    }

    public void setCurrPageNo(int currPageNo) {
        this.currPageNo = currPageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPageNo() {
        return totalPageNo;
    }

    public void setTotalPageNo(int totalPageNo) {
        this.totalPageNo = totalPageNo;
    }

    public int getTotaCount() {
        return totaCount;
    }

    public void setTotaCount(int totaCount) {
        this.totaCount = totaCount;
    }

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }
}
