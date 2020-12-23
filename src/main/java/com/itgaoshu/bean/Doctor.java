package com.itgaoshu.bean;

public class Doctor {
    private Integer doctorId;//医生id
    private String doctorNamr;//医生姓名
    private  Integer departmentId;//科室id
    private String department;//科室名称
    private Integer registeredId;//挂号类型
    private String type;//类型
    private Integer dstate;//状态

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorNamr() {
        return doctorNamr;
    }

    public void setDoctorNamr(String doctorNamr) {
        this.doctorNamr = doctorNamr;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getRegisteredId() {
        return registeredId;
    }

    public void setRegisteredId(Integer registeredId) {
        this.registeredId = registeredId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDstate() {
        return dstate;
    }

    public void setDstate(Integer dstate) {
        this.dstate = dstate;
    }
}

