package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;

public class GetPersonById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 1);
		
		System.out.println("Id is " + person.getId());
		System.out.println("Name is " + person.getName());
		System.out.println("Age is " + person.getAge());
		//Pan pan = person.getPan();
		System.out.println("Pan Number is " + person.getPan().getPanNumber());
		System.out.println("Father Name is " + person.getPan().getFatherName());
	}

}
