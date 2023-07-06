package com.hibernate.app.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class OneToManyClient {

	public static void main(String[] args) {

		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Question question = new Question();
		question.setQName("What is Servlet");

		Answer answer = new Answer();
		answer.setAnswername("Servlet is Specification");
		answer.setPostedBy("Nitin Malkar");

		Answer answer1 = new Answer();
		answer1.setAnswername("Servlet is API");
		answer1.setPostedBy("Sneha Malkar");

		List<Answer> ansList = new ArrayList<>();
		ansList.add(answer);
		ansList.add(answer1);

		question.setAnswer(ansList);

		session.persist(question);
		transaction.commit();

		session.close();
		sessionFactory.close();

	}

}
