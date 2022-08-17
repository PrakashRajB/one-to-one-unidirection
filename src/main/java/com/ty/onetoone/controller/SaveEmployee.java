package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Employee;
import com.ty.onetoone.dto.SalaryAccount;

public class SaveEmployee {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		SalaryAccount account = new SalaryAccount();
		account.setAccno(56823718l);
		account.setBankName("INDIAN Bank");
		account.setIfscCode("indb0002737");

		Employee employee = new Employee();
		employee.setName("Viraj");
		employee.setDepartment("Testing");
		employee.setAccount(account);

		entityTransaction.begin();
		entityManager.persist(employee);
		entityManager.persist(account);
		entityTransaction.commit();

		System.out.println("Data stored");
	}

}
