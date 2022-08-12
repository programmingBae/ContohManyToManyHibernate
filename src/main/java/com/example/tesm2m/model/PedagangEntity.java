package com.example.tesm2m.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pedagang", schema = "tesmanytomany", catalog = "")
public class PedagangEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idpedagang")
    private int idpedagang;
    @Basic
    @Column(name = "namaPedagang")
    private String namaPedagang;

    public int getIdpedagang() {
        return idpedagang;
    }

    public void setIdpedagang(int idpedagang) {
        this.idpedagang = idpedagang;
    }

    public String getNamaPedagang() {
        return namaPedagang;
    }

    public void setNamaPedagang(String namaPedagang) {
        this.namaPedagang = namaPedagang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PedagangEntity that = (PedagangEntity) o;
        return idpedagang == that.idpedagang && Objects.equals(namaPedagang, that.namaPedagang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpedagang, namaPedagang);
    }
}
