package com.hibernate.app.onetoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class OneToOneClient {

	public static void main(String[] args) {

		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = new Employee();
		employee.setName("Santosh Malkar");
		employee.setEmail("santossh.malkar@xoriant.com");

		Address address = new Address();
		address.setAddressLine1("G-21,Lohia nagar");
		address.setCity("Ghaziabad");
		address.setState("UP");
		address.setCountry("India");
		address.setPin(201301);

		employee.setAddress(address);
		address.setEmployee(employee);

		session.persist(employee);
		transaction.commit();

		session.close();
		sessionFactory.close();

	}

}
