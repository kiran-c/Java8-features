package com.orakle.streamfilterpredicateoptional;

public class Employee {

	String empName;
	Double salary;
	
	Employee(String empName, Double salary)
	{
		this.empName = empName;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public Double getSalary() {
		return salary;
	}
	
	
}
