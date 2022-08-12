package com.example.tesm2m.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyConnection {
    public static Session getsession(){
        Session s;
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        s = sf.openSession();
        return s;
    }
}
