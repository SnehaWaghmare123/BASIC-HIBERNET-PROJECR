package com.jsp.bank;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HelperClass {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sneha");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void HelperClassEmp(Employee employee) {
	
	et.begin();
	em.persist(employee);
	et.commit();
	System.out.println("all good");
	}
	public void HelperClassUser(User user) {
	
		et.begin();
		em.persist(user);
		et.commit();
		System.out.println("all good");
		}
	public void HelperClassDeleteUser(int id) {
		
		
		User u1=em.find(User.class,id);
		if(u1!=null) {
		et.begin();
		em.remove(u1);
		et.commit();
		System.out.println("all good");
		}else {
			System.out.println("Id is not Vaild");
		}
	}
	public void HelperClassDeleteEmp(int id) {
		
		Employee e1=em.find(Employee.class,id);
		if(e1!=null) {
		et.begin();
		em.remove(e1);
		et.commit();
		System.out.println("all good");
		}else {
			System.out.println("Id is not Vaild");
		}
	}
	public void HelperClassUpdateUser(User user) {
		
		et.begin();
		em.merge(user);
		et.commit();
		System.out.println("all good");
		}
	
		public void HelperClassUpdateEmp(Employee emp) {
			
			
			et.begin();
			em.merge(emp);
			et.commit();
			System.out.println("all good");
		
		}
		public List<Employee> GetAllEmployee(Employee employee)
		{
		String sql="Select e From Employee e ";
		Query q=em.createQuery(sql);
		List<Employee> emp=q.getResultList();
		return emp;
		}
		public List<User> GetAllUser(User user)
		{
		String sql="Select u From User u ";
		Query q=em.createQuery(sql);
		List<User> u=q.getResultList();
		return u;
		}
}
