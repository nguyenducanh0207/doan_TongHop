package com.example.doan_tonghop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Export")
public class ExportEntity extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "OwnerID")
    private GuestAccountEntity guestAccuont_ID;

    @Column(name = "StatusID")
    private Long statusId;

    @ManyToOne
    @JoinColumn(name = "CreateBy")
    private UserAccountEntity useAccount_ID;

    @OneToMany(mappedBy = "Export_Id")
    private List<ProductEntity> exports = new ArrayList<>();


    public GuestAccountEntity getGuestAccuont_ID() {
        return guestAccuont_ID;
    }

    public void setGuestAccuont_ID(GuestAccountEntity guestAccuont_ID) {
        this.guestAccuont_ID = guestAccuont_ID;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public UserAccountEntity getUseAccount_ID() {
        return useAccount_ID;
    }

    public void setUseAccount_ID(UserAccountEntity useAccount_ID) {
        this.useAccount_ID = useAccount_ID;
    }

    public List<ProductEntity> getExports() {
        return exports;
    }

    public void setExports(List<ProductEntity> exports) {
        this.exports = exports;
    }

}
