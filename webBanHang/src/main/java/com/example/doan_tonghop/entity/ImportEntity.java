package com.example.doan_tonghop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Import")
public class ImportEntity extends BaseEntity{
    @Column(name = "OwnerID")
    public Long ownerID;

    @Column(name = "StatusID ")
    public Long statusID;

    @ManyToOne
    @JoinColumn(name = "CreateBy")
    private UserAccountEntity useAccount_ID;

    @OneToMany(mappedBy = "Import_Id")
    private List<ProductEntity> products = new ArrayList<>();



    public Long getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Long ownerID) {
        this.ownerID = ownerID;
    }

    public Long getStatusID() {
        return statusID;
    }

    public void setStatusID(Long statusID) {
        this.statusID = statusID;
    }

    public UserAccountEntity getUseAccount_ID() {
        return useAccount_ID;
    }

    public void setUseAccount_ID(UserAccountEntity useAccount_ID) {
        this.useAccount_ID = useAccount_ID;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }


}
