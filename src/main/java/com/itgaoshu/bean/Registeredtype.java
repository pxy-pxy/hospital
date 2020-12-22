package com.itgaoshu.bean;

/**
 * @author Tan
 * @create 2020-12-21 20:14
 */
public class Registeredtype {
    private int registeredId;//挂号id
    private String type;//挂号状态
    private double price;//挂号价格

    public int getRegisteredId() {

        return registeredId;
    }

    public void setRegisteredId(int registeredId) {

        this.registeredId = registeredId;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }
}
