package com.hibernate.app.manytomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ManyToManyClient {

	public static void main(String[] args) {

		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Question1 question1 = new Question1();
		question1.setQname("What is Java");

		Answer1 answer1 = new Answer1();
		answer1.setAnswername("Java is programming language");
		answer1.setPostedBy("Priyanka Sagane");

		Answer1 answer2 = new Answer1();
		answer2.setAnswername("Java is platform");
		answer2.setPostedBy("Sneha Takale");

		ArrayList<Answer1> ansList = new ArrayList<>();
		ansList.add(answer1);
		ansList.add(answer2);

		question1.setAnswers(ansList);

		session.persist(question1);
		transaction.commit();

		session.close();
		sessionFactory.close();

		System.out.println("Data Saved Successfully");

	}

}
