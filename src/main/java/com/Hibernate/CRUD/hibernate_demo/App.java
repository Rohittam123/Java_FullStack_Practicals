package com.Hibernate.CRUD.hibernate_demo;

import com.entity.Country;
import com.entity.Region;
import com.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Create Region
            Region region = new Region();
            region.setRegionName("Asia");
            session.save(region);

            // Create Country
            Country country = new Country();
            country.setCountryId("IN");
            country.setCountryName("India");
            country.setRegion(region);
            session.save(country);

            // Commit transaction
            tx.commit();

            System.out.println("Data Inserted Successfully!");

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
