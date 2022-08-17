package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;

import com.ty.onetoone.dto.Employee;
import com.ty.onetoone.dto.SalaryAccount;

public class GetEmployeeById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Employee employee = entityManager.find(Employee.class, 1);
		System.out.println("Employee id - " + employee.getId());
		System.out.println("Employee Name - " + employee.getName());
		System.out.println("Employee Department - " + employee.getDepartment());
		SalaryAccount account = employee.getAccount();
		System.out.println("Salary Account number - " + account.getAccno());
		System.out.println("Bank Name - " + account.getBankName());
		System.out.println("Ifsc Code - " + account.getIfscCode());
	}

}
