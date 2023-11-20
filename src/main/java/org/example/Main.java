package org.example;


import hibernate_test.model.Worker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Worker.class);
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            Worker worker = new Worker(
                    "Petrov1@gmail.com",
                    "Vasya",
                    "Petrov",
                    40);

//            session.save(worker);
            session.saveOrUpdate(worker);

            session.getTransaction().commit();
        }
    }
}