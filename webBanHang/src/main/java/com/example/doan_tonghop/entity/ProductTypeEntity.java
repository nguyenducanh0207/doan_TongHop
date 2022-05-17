package com.example.doan_tonghop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ProductType")
public class ProductTypeEntity extends BaseEntity {
    @Column(name = "NameOfType")
    private String nameOfType;

    @OneToMany(mappedBy = "productType")
    private List<ProductNameEntity> productNames = new ArrayList<>();

}
