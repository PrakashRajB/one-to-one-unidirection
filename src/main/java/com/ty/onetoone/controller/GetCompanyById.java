package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Company;
import com.ty.onetoone.dto.Gst;

public class GetCompanyById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Gst gst = entityManager.find(Gst.class, 2);

		System.out.println("Gst Id is " + gst.getId());
		System.out.println("Gst Number is " + gst.getGstNumber());
		System.out.println("Gst status is " + gst.getStatus());

		Company company = gst.getCompany();
		if (company != null) {
			System.out.println("Company Name is " + company.getName());
			System.out.println("Company Mobile Number is " + company.getPhone());
		}
	}

}
