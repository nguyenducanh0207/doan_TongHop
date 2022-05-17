package com.example.doan_tonghop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PruductName")
public class ProductNameEntity extends BaseEntity{
    @Column(name = "ProductName")
    private String productName;

    @ManyToOne
    @JoinColumn(name = "ProductType_ID ")
    private ProductTypeEntity productType;

    @Column(name = "ProductCount")
    private Long productCount;


    @Column(name = "CreateBy")
    private Long createBy;

    @Column(name = "Cost")
    private Long cost;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductTypeEntity getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeEntity productType) {
        this.productType = productType;
    }

    public Long getProductCount() {
        return productCount;
    }

    public void setProductCount(Long productCount) {
        this.productCount = productCount;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }


}
