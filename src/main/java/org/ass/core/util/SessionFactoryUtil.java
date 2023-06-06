package org.ass.core.util;

import org.ass.core.entity.Airhostess;
import org.ass.core.entity.Brand;
import org.ass.core.entity.Captain;
import org.ass.core.entity.Company;
import org.ass.core.entity.Employee;
import org.ass.core.entity.Flight;
import org.ass.core.entity.Product;
import org.ass.core.entity.Team;
import org.ass.core.entity.UserEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	
	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			cfg.addAnnotatedClass(UserEntity.class);
			cfg.addAnnotatedClass(Team.class);
			cfg.addAnnotatedClass(Captain.class);
			cfg.addAnnotatedClass(Flight.class);
			cfg.addAnnotatedClass(Airhostess.class);
			cfg.addAnnotatedClass(Employee.class);
			cfg.addAnnotatedClass(Company.class);
			cfg.addAnnotatedClass(Brand.class);
			cfg.addAnnotatedClass(Product.class);
			 sessionFactory = cfg.buildSessionFactory();	
		}
		return sessionFactory;
		
	}

}
