package com.itgaoshu.bean;

/**
 * @author Tan
 * @create 2020-12-22 15:27
 */

public class Warehuose {
    private Integer warehouseId;//序号
    private String supplierName;// 库房名

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
