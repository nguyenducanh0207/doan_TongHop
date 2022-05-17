package com.example.doan_tonghop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ActionType")
public class ActionTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ActionDescription ")
    private String actionDescription;

    @OneToMany(mappedBy = "ActionType_Id")
    private List<LogTableEntity> logTables = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    public List<LogTableEntity> getLogTables() {
        return logTables;
    }

    public void setLogTables(List<LogTableEntity> logTables) {
        this.logTables = logTables;
    }
}
