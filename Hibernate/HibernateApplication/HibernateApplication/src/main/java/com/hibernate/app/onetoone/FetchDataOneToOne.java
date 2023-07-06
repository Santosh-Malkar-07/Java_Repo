package com.hibernate.app.onetoone;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FetchDataOneToOne {

	public static void main(String[] args) {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.buildSessionFactory();
		Session session = sessionFactory.openSession();

		@SuppressWarnings("unchecked")
		TypedQuery<Employee> emQuery = session.createQuery("from Employee");
		List<Employee> empList = emQuery.getResultList();

		Iterator<Employee> iterator = empList.iterator();
		while (iterator.hasNext()) {

			Employee employee = iterator.next();

			System.out.println(employee.getEmployeeId());
			System.out.println(employee.getName());
			System.out.println(employee.getEmail());

			Address address = employee.getAddress();
			System.out.println(address.getAddressId());
			System.out.println(address.getCity());
			System.out.println(address.getCountry());
			System.out.println(address.getState());
			System.out.println(address.getPin());

		}
		session.close();

	}

}
