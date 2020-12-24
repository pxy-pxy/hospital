package com.itgaoshu.bean;
//住院收费项目
public class Inoutpatienttype {
    private Integer inoutpatientId;//序号
    private String projectName;//类型
    private  Integer unit;//单位
    private  Integer bigproJectId;//项目分类
    private double price;//单价

    public Integer getInoutpatientId() {
        return inoutpatientId;
    }

    public void setInoutpatientId(Integer inoutpatientId) {
        this.inoutpatientId = inoutpatientId;
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

    public Integer getBigproJectId() {
        return bigproJectId;
    }

    public void setBigproJectId(Integer bigproJectId) {
        this.bigproJectId = bigproJectId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
