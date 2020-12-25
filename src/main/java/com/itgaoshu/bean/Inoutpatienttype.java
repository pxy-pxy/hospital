package com.itgaoshu.bean;
//住院收费项目
public class Inoutpatienttype {
    private Integer inoutpatientId;//序号
    private String pprojectName;//项目大类名
    private String projectName;//住院收费项
    private Integer unit;
    private Integer unitId;
    private String unitName;
    private  Integer bigproJectId;//项目分类
    private double price;//单价
    private Integer projectId;

    public String getPprojectName() {
        return pprojectName;
    }

    public void setPprojectName(String pprojectName) {
        this.pprojectName = pprojectName;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

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
