package org.ass.ums.repository;

import java.util.Collections;
import java.util.List;

import org.ass.ums.entity.RegisterEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.xdevapi.Collection;
@Repository
public class RegisterRepository {
	@Autowired
	private SessionFactory sessionfactory;
	
	public  List<RegisterEntity> findAllUsers(){
		try {
		String hqlQuery="from RegisterEntity";
		Session session = sessionfactory.openSession();
		Query query = session.createQuery(hqlQuery);
		return query.getResultList();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.EMPTY_LIST;
		
	}
	public void saveUser(RegisterEntity  registerEntity) {
	try {
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(registerEntity);
		transaction.commit();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
