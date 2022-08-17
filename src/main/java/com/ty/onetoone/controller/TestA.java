package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;

public class TestA {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = new Person();
		person.setAge(25);
		person.setName("Umesha");

		Pan pan = new Pan();
		pan.setPanNumber("cgbdu5364m");
		pan.setFatherName("silendhra");

		person.setPan(pan);

		entityTransaction.begin();

		entityManager.persist(person);
		entityManager.persist(pan);

		entityTransaction.commit();
		System.out.println("Data Stored");

	}
}
