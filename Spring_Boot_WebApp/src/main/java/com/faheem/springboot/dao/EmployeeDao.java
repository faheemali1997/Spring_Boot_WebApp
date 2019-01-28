package com.faheem.springboot.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.faheem.springboot.model.Employee;

@Repository
public class EmployeeDao {
	
	private List<Employee> employeeList = new ArrayList<>();
	
	public boolean addEmployee(Employee employee)
	{
		return employeeList.add(employee);
	}
	
	public boolean removeEmployee(int employeeId)
	{
		Iterator<Employee> iterator = employeeList.iterator();
		while(iterator.hasNext())
		{
			Employee employee = iterator.next();
			if(employee.getEmployeeId()==employeeId){
				iterator.remove();
				return true;
			}
		}
		return false;	
	}
	
	public List<Employee> getEmployee(){
		return employeeList;
	}
}
