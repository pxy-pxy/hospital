package com.itgaoshu.bean;
//门诊收费项目
public class Outpatienttype {
    private  Integer outpatientId;//序号
    private String pprojectName;//项目大类名
    private String projectName;//门诊收费项
    private Integer unit;//单位
    private Integer unitId;
    private String unitName;
    private Integer bigprojectId;//项目分类
    private double price;//单价
    private Integer ostate;

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

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

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
