package com.example.tesm2m.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "supplier", schema = "tesmanytomany", catalog = "")
public class SupplierEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idsupplier")
    private int idsupplier;
    @Basic
    @Column(name = "namaSupplier")
    private String namaSupplier;

    public int getIdsupplier() {
        return idsupplier;
    }

    public void setIdsupplier(int idsupplier) {
        this.idsupplier = idsupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierEntity that = (SupplierEntity) o;
        return idsupplier == that.idsupplier && Objects.equals(namaSupplier, that.namaSupplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idsupplier, namaSupplier);
    }
}
