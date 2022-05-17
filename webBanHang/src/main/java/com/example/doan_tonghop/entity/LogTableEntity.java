package com.example.doan_tonghop.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "LogTable")
public class LogTableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ActionID")
    private ActionTypeEntity ActionType_Id;

    @Column(name = "TargetID ")
    private Long targetID;

    @Column(name = "CreatAt")
    private Date createAt;

    @ManyToOne
    @JoinColumn(name = "CreatBy")
    private UserAccountEntity useAccount_ID;

    @Column(name = "IsDelete")
    private boolean isDelete;

    @Column(name = "DeleteBy")
    private  Long deleteBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ActionTypeEntity getActionType_Id() {
        return ActionType_Id;
    }

    public void setActionType_Id(ActionTypeEntity actionType_Id) {
        ActionType_Id = actionType_Id;
    }

    public Long getTargetID() {
        return targetID;
    }

    public void setTargetID(Long targetID) {
        this.targetID = targetID;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public UserAccountEntity getUseAccount_ID() {
        return useAccount_ID;
    }

    public void setUseAccount_ID(UserAccountEntity useAccount_ID) {
        this.useAccount_ID = useAccount_ID;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public Long getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(Long deleteBy) {
        this.deleteBy = deleteBy;
    }
}
