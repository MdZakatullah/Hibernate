package org.ass.core.repository;

import java.util.List;
import org.ass.core.entity.UserEntity;
import org.ass.core.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserHqlRepository {
	
	public List<UserEntity> findAll() {
	//	String hqlQuery = "from UserEntity";
		StringBuilder builder = new StringBuilder();
		builder.append("from UserEntity");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
		return query.getResultList();	
	}
	
	public List<UserEntity> findByName(String name) {
		StringBuilder builder = new StringBuilder();
		builder.append("from UserEntity where name=:n");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
		query.setParameter("n", name);
		return query.getResultList();
		
	}
	
	public void updatePasswordByEmail(String email, String password){
		StringBuilder builder = new StringBuilder();
		builder.append("update UserEntity set "); 
		builder.append("password=:pwd where email=:e");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(builder.toString());
		query.setParameter("pwd", password);
		query.setParameter("e", email);
		query.executeUpdate();
		transaction.commit();
	}
	
	public void deleteByEmail(String email) {
		StringBuilder builder = new StringBuilder();
		builder.append("delete from UserEntity ");
		builder.append("where email=:e");	
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(builder.toString());
		query.setParameter("e", email);
		query.executeUpdate();
		transaction.commit();
	}

}
