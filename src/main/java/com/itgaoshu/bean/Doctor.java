package com.itgaoshu.bean;

/**
 * @author Tan
 * @create 2020-12-21 17:13
 */
public class Doctor {
    private Integer doctorId;//医生id
    private String doctorName;//医生名字
    private Integer departmentId;//部门
    private Integer registeredId;//挂号id
    private Integer  dstate;//状态

    @Override
    public String toString() {
        return "CDoctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", departmentId=" + departmentId +
                ", registeredId=" + registeredId +
                ", dstate=" + dstate +
                '}';
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getRegisteredId() {
        return registeredId;
    }

    public void setRegisteredId(Integer registeredId) {
        this.registeredId = registeredId;
    }

    public Integer getDstate() {
        return dstate;
    }

    public void setDstate(Integer dstate) {
        this.dstate = dstate;
    }
}


