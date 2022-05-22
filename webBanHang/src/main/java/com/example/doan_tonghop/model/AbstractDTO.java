package com.example.doan_tonghop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class AbstractDTO<T> {
    private Long id;
    private Date creatAt;
    private Date updaetAt;
    private Long updateBy;
    private Boolean iSDelete;
    private Long deleteBy;
    private List<T> listResult = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }

    public Date getUpdaetAt() {
        return updaetAt;
    }

    public void setUpdaetAt(Date updaetAt) {
        this.updaetAt = updaetAt;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Boolean getiSDelete() {
        return iSDelete;
    }

    public void setiSDelete(Boolean iSDelete) {
        this.iSDelete = iSDelete;
    }

    public Long getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(Long deleteBy) {
        this.deleteBy = deleteBy;
    }

    public List<T> getListResult() {
        return listResult;
    }

    public void setListResult(List<T> listResult) {
        this.listResult = listResult;
    }
}
