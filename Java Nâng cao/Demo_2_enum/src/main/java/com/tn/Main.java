package com.tn;

import com.tn.entity.Account;
import com.tn.entity.AccountType;
import com.tn.entity.Person;
import com.tn.entity.PersonType;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = null;
        try {
            session = buildSessionFactory().openSession();
            // get by id
            Person person= new Person();
            person = session.get(Person.class,1);
            System.out.println(person.getFullName());

            // get all data
           Query<Person> query =session.createQuery("FROM Person");
           List<Person> listPerson =query.getResultList();
            for (Person per:listPerson){
                System.out.println(per.getFullName());
            }

            // delete by id
            session.getTransaction().begin();
            Person person1 = new Person();
            person1 = session.get(Person.class,1);
            session.delete(person1);
            session.getTransaction().commit();

            // update by id
            session.getTransaction().begin();
            Person person1 = new Person();
            person1 = session.get(Person.class,1);
            person1.setFullName("Manh032ưewew13");
            session.update(person);
            session.getTransaction().commit();

            // update type by id
            session.getTransaction().begin();
            Person person2 = new Person();
            person2 = session.get(Person.class,1);
            person2.setPersonType(PersonType.MANAGER);
            session.update(person2);
            session.getTransaction().commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    private static SessionFactory buildSessionFactory() {
        // load configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Account.class);
        configuration.addAnnotatedClass(Person.class);


        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

        return configuration.buildSessionFactory(serviceRegistry);
    }
}
