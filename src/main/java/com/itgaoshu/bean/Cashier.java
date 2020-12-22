package com.itgaoshu.bean;

/**
 * @author Tan
 * @create 2020-12-22 9:32
 */
public class Cashier {
    private  int cashier;//处方id
    private  Integer reportId;//挂号id
    private  String durgname;//药品名称
    private int durgnum;//药品数量
    private  double repiceprice;//药品价格
    private  double repicetotal;//总价
    private Integer state;//状态
    private  Integer ostate;//项目状态
    private String jie;
    private  Integer mstate;


    public int getCashier() {
        return cashier;
    }

    public void setCashier(int cashier) {
        this.cashier = cashier;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public String getDurgname() {
        return durgname;
    }

    public void setDurgname(String durgname) {
        this.durgname = durgname;
    }

    public int getDurgnum() {
        return durgnum;
    }

    public void setDurgnum(int durgnum) {
        this.durgnum = durgnum;
    }

    public double getRepiceprice() {
        return repiceprice;
    }

    public void setRepiceprice(double repiceprice) {
        this.repiceprice = repiceprice;
    }

    public double getRepicetotal() {
        return repicetotal;
    }

    public void setRepicetotal(double repicetotal) {
        this.repicetotal = repicetotal;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public String getJie() {
        return jie;
    }

    public void setJie(String jie) {
        this.jie = jie;
    }

    public Integer getMstate() {
        return mstate;
    }

    public void setMstate(Integer mstate) {
        this.mstate = mstate;
    }
}
