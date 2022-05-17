package com.example.doan_tonghop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "UserAccount")
public class UserAccountEntity extends BaseEntity {

    @Column(name = "UserName")
    private String userName;

    @Column(name = "Code")
    private String code;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Number")
    private String number;

    @Column(name = "Mail")
    private String mail;

    @OneToMany(mappedBy = "useAccount_ID")
    private List<ImportEntity> Imports = new ArrayList<>();

    @OneToMany(mappedBy = "useAccount_ID")
    private List<ExportEntity> Exports = new ArrayList<>();

    @OneToMany(mappedBy = "useAccount_ID")
    private List<ProductEntity> products = new ArrayList<>();

    @OneToMany(mappedBy = "useAccount_ID")
    private List<LogTableEntity> logTables = new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<ImportEntity> getImports() {
        return Imports;
    }

    public void setImports(List<ImportEntity> imports) {
        Imports = imports;
    }

    public List<ExportEntity> getExports() {
        return Exports;
    }

    public void setExports(List<ExportEntity> exports) {
        Exports = exports;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }

    public List<LogTableEntity> getLogTables() {
        return logTables;
    }

    public void setLogTables(List<LogTableEntity> logTables) {
        this.logTables = logTables;
    }
}
