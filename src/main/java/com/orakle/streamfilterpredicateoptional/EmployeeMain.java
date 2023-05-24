package com.orakle.streamfilterpredicateoptional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee[] empList = 
			{
					new Employee("wess", 25000.0),
					new Employee("Messy", 32000.0),
					new Employee("wills", 73000.0),
					new Employee("john", 64000.0)
					
			};
				
					List<Employee> eList = Arrays.asList(empList);
					
					 List<String> list= eList
					.parallelStream()
					.filter(emp -> emp.getSalary() > 40000)
					.map(emp -> emp.getEmpName())
					.collect(Collectors.toList());
					
					System.out.println("Employee Names :"+list);
					
					
					
	}

}
