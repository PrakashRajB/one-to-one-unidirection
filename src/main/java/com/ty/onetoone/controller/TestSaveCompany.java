package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Company;
import com.ty.onetoone.dto.Gst;

public class TestSaveCompany {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Company company = new Company();
		company.setName("Kavi Garments");
		company.setPhone(9940332321l);

		Gst gst = new Gst();
		gst.setCompany(company);
		gst.setGstNumber("kjekd1234");
		gst.setStatus("Active");

		entityTransaction.begin();

		entityManager.persist(company);
		entityManager.persist(gst);

		entityTransaction.commit();
	}

}
