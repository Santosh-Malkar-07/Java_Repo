package com.hibernate.app.onetomany;

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

public class FetchDataOneToMany {

	public static void main(String[] args) {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

		SessionFactory sessionFactory = metadata.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		@SuppressWarnings("unchecked")
		TypedQuery<Question> typedQuery = session.createQuery("from Question");
		List<Question> queList = typedQuery.getResultList();

		Iterator<Question> iterator = queList.iterator();
		while (iterator.hasNext()) {
			Question question = iterator.next();

			System.out.println(question.getId() + "    " + question.getQName());
			System.out.println();
			System.out.println("Answer :      " + question.getAnswer());
			System.out.println();

		}

	}

}
