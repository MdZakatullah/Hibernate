package org.ass.core.repository;

import org.ass.core.dto.UserDto;
import org.ass.core.entity.UserEntity;
import org.ass.core.util.ConnectionPropertiesUtil;
import org.ass.core.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserRepository {
	
	public void saveOrUpdateUseDetails(UserEntity userEntity) {
		
//		Configuration cfg = new Configuration();
//		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
//		cfg.addAnnotatedClass(UserEntity.class);
//		SessionFactory SessionFactory = SessionFactoryUtil.getSessionFactory();
//		Session session = SessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
		//session.save(userEntity);
//		transaction.commit();
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(userEntity);
		transaction.commit();
	}
	
	public UserEntity findById(long id) {
				
//		Configuration cfg = new Configuration();
//		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
//		cfg.addAnnotatedClass(UserEntity.class);
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		return session.get(UserEntity.class, id);
	}
	
	public void update(UserDto userDto) {
		UserEntity userEntity=findById(userDto.getAltkey());
		if(userEntity !=null) {
			userEntity.setName(userDto.getName());
			userEntity.setCity(userDto.getCity());
			userEntity.setCountry(userDto.getCountry());
			userEntity.setPincode(userDto.getPincode());
			
			saveOrUpdateUseDetails(userEntity);
			
//			Configuration cfg = new Configuration();
//			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
//			cfg.addAnnotatedClass(UserEntity.class);
//			
//			SessionFactory SessionFactory = cfg.buildSessionFactory();
//			Session session = SessionFactory.openSession();
//			
//			Transaction transaction = session.beginTransaction();
//			session.merge(userEntity);
//			transaction.commit();
		}
			
	}
	
	private void delete() {

		}
			
			
	}
