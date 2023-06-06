package org.ass.core.repository;

import org.ass.core.entity.Employee;
import org.ass.core.entity.Flight;
import org.ass.core.entity.Team;
import org.ass.core.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AssociationRepository {
	
	//for one to one
	public void saveTeamDetails(Team team) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(team);
		transaction.commit();
	}
	
	//for one to many
	public void saveFlightDetails(Flight flight) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(flight);
		transaction.commit();
	}
	
	//for many to one
	public void saveEmployeeDetails(Employee employee) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(employee);
		transaction.commit();
	}

}
