package com.faheem.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faheem.springboot.dao.EmployeeDao;
import com.faheem.springboot.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	public boolean addEmployee(Employee employee)
	{
		return employeeDao.addEmployee(employee);
	}
	
	public boolean removeEmployee(String employeeId)
	{
		int employeeIdInt = Integer.parseInt(employeeId);
		return employeeDao.removeEmployee(employeeIdInt);
	}
	
	public List<Employee> getEmployee(){
		return employeeDao.getEmployee();
	}

}
