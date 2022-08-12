package com.example.tesm2m.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pedagang_has_supplier", schema = "tesmanytomany", catalog = "")
public class PedagangHasSupplierEntity {
    @Override
    public String toString() {
        return pedagangByPedagangIdpedagang.getNamaPedagang() + " - " + supplierBySupplierIdsupplier.getNamaSupplier();
    }

    @ManyToOne
    @JoinColumn(name = "pedagang_idpedagang", referencedColumnName = "idpedagang", nullable = false)
    private PedagangEntity pedagangByPedagangIdpedagang;
    @ManyToOne
    @JoinColumn(name = "supplier_idsupplier", referencedColumnName = "idsupplier", nullable = false)
    private SupplierEntity supplierBySupplierIdsupplier;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPedagangHasSupplier")
    private int idPedagangHasSupplier;

    public PedagangEntity getPedagangByPedagangIdpedagang() {
        return pedagangByPedagangIdpedagang;
    }

    public void setPedagangByPedagangIdpedagang(PedagangEntity pedagangByPedagangIdpedagang) {
        this.pedagangByPedagangIdpedagang = pedagangByPedagangIdpedagang;
    }

    public SupplierEntity getSupplierBySupplierIdsupplier() {
        return supplierBySupplierIdsupplier;
    }

    public void setSupplierBySupplierIdsupplier(SupplierEntity supplierBySupplierIdsupplier) {
        this.supplierBySupplierIdsupplier = supplierBySupplierIdsupplier;
    }

    public int getIdPedagangHasSupplier() {
        return idPedagangHasSupplier;
    }

    public void setIdPedagangHasSupplier(int idPedagangHasSupplier) {
        this.idPedagangHasSupplier = idPedagangHasSupplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PedagangHasSupplierEntity that = (PedagangHasSupplierEntity) o;
        return idPedagangHasSupplier == that.idPedagangHasSupplier;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPedagangHasSupplier);
    }
}
