package com.itgaoshu.bean;
//门诊收费项目
public class Outpatienttype {
    private  Integer outpatientId;//序号
    private String projectName;//项目名称
    private Integer unit;//单位
    private Integer bigprojectId;//项目分类
    private double price;//单价

    public Integer getOutpatientId() {
        return outpatientId;
    }

    public void setOutpatientId(Integer outpatientId) {
        this.outpatientId = outpatientId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getBigprojectId() {
        return bigprojectId;
    }

    public void setBigprojectId(Integer bigprojectId) {
        this.bigprojectId = bigprojectId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
