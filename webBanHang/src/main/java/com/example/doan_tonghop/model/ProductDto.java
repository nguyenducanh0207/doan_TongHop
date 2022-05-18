package com.example.doan_tonghop.model;

import java.util.Date;

public class ProductDto {
    private String producName;
    private Long productTypeId;
    private Long productCuont;
    private Long cost;
    private Long creatBy;

    public String getProducName() {
        return producName;
    }

    public void setProducName(String producName) {
        this.producName = producName;
    }

    public Long getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Long productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Long getProductCuont() {
        return productCuont;
    }

    public void setProductCuont(Long productCuont) {
        this.productCuont = productCuont;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Long getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(Long creatBy) {
        this.creatBy = creatBy;
    }
}
