package com.example.doan_tonghop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GuestAccount")
public class GuestAccountEntity extends BaseEntity {
    @Column(name = "Number")
    private String number;

    @Column(name = "UserName")
    private String useName;

    @Column(name = "Mail")
    private String mail;

    @Column(name = "ReceiveAddress")
    private String receiveAddress;

    @OneToMany(mappedBy = "guestAccuont_ID")
    private List<ExportEntity> Exprots = new ArrayList<>();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public List<ExportEntity> getExprots() {
        return Exprots;
    }

    public void setExprots(List<ExportEntity> exprots) {
        Exprots = exprots;
    }
}
