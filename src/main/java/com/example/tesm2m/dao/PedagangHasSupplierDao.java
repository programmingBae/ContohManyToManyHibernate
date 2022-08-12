package com.example.tesm2m.dao;

import com.example.tesm2m.model.PedagangHasSupplierEntity;
import com.example.tesm2m.model.SupplierEntity;
import com.example.tesm2m.util.MyConnection;
import javafx.collections.FXCollections;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class PedagangHasSupplierDao implements daointerface<PedagangHasSupplierEntity>{
    @Override
    public List<PedagangHasSupplierEntity> getData() {
        List<PedagangHasSupplierEntity> translist;
        translist = FXCollections.observableArrayList();
        Session s = MyConnection.getsession();
        CriteriaBuilder cb = s.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(PedagangHasSupplierEntity.class);
        cq.from(PedagangHasSupplierEntity.class);
        translist = s.createQuery(cq).getResultList();
        s.close();
        return translist;
    }
    public List<PedagangHasSupplierEntity> getDataPedagangBySupplier(PedagangHasSupplierEntity pedagangHasSupplierEntity) {
        List<PedagangHasSupplierEntity> translist;
        translist = FXCollections.observableArrayList();
        Session s = MyConnection.getsession();
        CriteriaBuilder cb = s.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(PedagangHasSupplierEntity.class);
        Root<SupplierEntity> root = cq.from(PedagangHasSupplierEntity.class);
        Predicate p = cb.equal(root.get("supplierBySupplierIdsupplier"),pedagangHasSupplierEntity.getSupplierBySupplierIdsupplier());
//        cq.from(PedagangHasSupplierEntity.class);
        cq.where(p);
        translist = s.createQuery(cq).getResultList();
        s.close();
        return translist;
    }
}
