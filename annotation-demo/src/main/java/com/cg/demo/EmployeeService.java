package com.cg.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



//@Component
@Service
public class EmployeeService {

	private EmployeeDAO dao;

	public EmployeeDAO getDao() {
		return dao;
	}

	@Autowired
	public void setDao(EmployeeDAO dao) {
		System.out.println("Performing Setter Injection");
		this.dao = dao;
	}
	
	
}

