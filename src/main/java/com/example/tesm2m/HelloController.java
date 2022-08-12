package com.example.tesm2m;

import com.example.tesm2m.dao.PedagangHasSupplierDao;
import com.example.tesm2m.model.PedagangHasSupplierEntity;
import com.example.tesm2m.model.SupplierEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class HelloController {
    public ListView listView;
    public void initialize (){
        PedagangHasSupplierDao pedagangHasSupplierDao = new PedagangHasSupplierDao();
        listView.getItems().addAll(pedagangHasSupplierDao.getData());
    }

    public void filter(ActionEvent actionEvent) {
        PedagangHasSupplierEntity pedagangHasSupplierEntity = (PedagangHasSupplierEntity) listView.getSelectionModel().getSelectedItem();
        listView.getItems().clear();
        PedagangHasSupplierDao pedagangHasSupplierDao = new PedagangHasSupplierDao();
        listView.getItems().addAll(pedagangHasSupplierDao.getDataPedagangBySupplier(pedagangHasSupplierEntity));
    }

    public void noFilter(ActionEvent actionEvent) {
        listView.getItems().clear();
        PedagangHasSupplierDao pedagangHasSupplierDao = new PedagangHasSupplierDao();
        listView.getItems().addAll(pedagangHasSupplierDao.getData());
    }
}