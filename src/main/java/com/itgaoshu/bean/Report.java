package com.itgaoshu.bean;

import java.sql.Date;

/**
 * @author Tan
 * @create 2020-12-21 15:37
 */
public class Report {
    private int reportId; //挂号人ID
    private String reportName; //挂号人名字
    private String sex;//挂号人性别
    private int age;//挂号人年龄
    private Integer department;//要挂号的部门
    private Integer doctor;//挂号医生
    private Integer reportType;//挂号类型
    private double price;//挂号价格
    private Date time;//挂号时间
    private String users;//(挂号人)
    private Integer state;//状态
    private String phone;//挂号人电话
    private String carid;//挂号人身份证号
    private String zhuan;//病情

    public int getReportId() {

        return reportId;
    }

    public void setReportId(int reportId) {

        this.reportId = reportId;
    }

    public String getReportName() {

        return reportName;
    }

    public void setReportName(String reportName) {

        this.reportName = reportName;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {

        this.sex = sex;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public Integer getDepartment() {

        return department;
    }

    public void setDepartment(Integer department) {

        this.department = department;
    }

    public Integer getDoctor() {

        return doctor;
    }

    public void setDoctor(Integer doctor) {

        this.doctor = doctor;
    }

    public Integer getReportType() {

        return reportType;
    }

    public void setReportType(Integer reportType) {

        this.reportType = reportType;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public Date getTime() {

        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {

        this.users = users;
    }

    public Integer getState() {

        return state;
    }

    public void setState(Integer state) {

        this.state = state;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public String getCarid() {

        return carid;
    }

    public void setCarid(String carid) {

        this.carid = carid;
    }

    public String getZhuan() {

        return zhuan;
    }

    public void setZhuan(String zhuan) {

        this.zhuan = zhuan;
    }
}
