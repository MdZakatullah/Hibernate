package org.ass.core.repository;

import org.ass.core.entity.Brand;
import org.ass.core.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Repositorym {
//	public void saveBrand(Brand b) {
//		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
//		Session session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(b);
//		transaction.commit();
//}

	public void saveBrand(Brand b) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(b);
		transaction.commit();
		
		
	}
}
