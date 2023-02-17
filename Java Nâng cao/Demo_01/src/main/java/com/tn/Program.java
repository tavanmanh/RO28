package com.tn;


import com.tn.entity.Person;
import com.tn.entity.Product;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> list=  Arrays.asList(1,2,3);
        int randomElement = (int) (Math.random() * list.size());
        System.out.println(list.get(randomElement));
    }

}
