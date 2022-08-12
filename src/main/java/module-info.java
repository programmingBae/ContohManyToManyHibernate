module com.example.tesm2m {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;


    opens com.example.tesm2m to javafx.fxml;
    opens com.example.tesm2m.model;
    exports com.example.tesm2m;
}