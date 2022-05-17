package com.example.doan_tonghop.entity;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class ProductEntity extends BaseEntity {
    @Column(name = "ProductNameID")
    private Long productNameId;

    @Column(name = "BarCode")
    private Long barCode;

    @ManyToOne
    @JoinColumn(name = "ImportID")
    private ImportEntity Import_Id;

    @ManyToOne
    @JoinColumn(name = "ExportID")
    private ExportEntity Export_Id;

    @Column(name = "StatusID")
    private Long statusId;

    @ManyToOne
    @JoinColumn(name = "CreateBy")
    private  UserAccountEntity  useAccount_ID;

    public Long getProductNameId() {
        return productNameId;
    }

    public void setProductNameId(Long productNameId) {
        this.productNameId = productNameId;
    }

    public Long getBarCode() {
        return barCode;
    }

    public void setBarCode(Long barCode) {
        this.barCode = barCode;
    }

    public ImportEntity getImport_Id() {
        return Import_Id;
    }

    public void setImport_Id(ImportEntity import_Id) {
        Import_Id = import_Id;
    }

    public ExportEntity getExport_Id() {
        return Export_Id;
    }

    public void setExport_Id(ExportEntity export_Id) {
        Export_Id = export_Id;
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
}
