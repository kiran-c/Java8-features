package com.orakle.streamfilterpredicateoptional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

public class EmployeeOptionalMain {

	public static void main(String[] args) {

		Employee[] empList = 
			{
					new Employee("wess", 25000.0),
					new Employee("Messy", 32000.0),
					new Employee("wills", 73000.0),
					new Employee("john", 64000.0)
					
			};
				
					try 
					{
					
						
						List<Employee> eList = Arrays.asList(empList);
						
						Optional<Employee> optEmp = eList.stream()
						.filter(emp -> emp.getSalary() >= 32000 )
						//.map(emp -> emp.getEmpName())
						.findFirst();
						
						if(optEmp.isPresent())
						{
							
							Employee e = optEmp.get();
							System.out.println("Employee Name: "+e.getEmpName());
							System.out.println("Employee Salary: "+e.getSalary());
						}
						else
						{
							System.out.println("No Match Found...!");
						}
						
						
						String name = "Kiran"; 
						Optional<String> str = name!= null ? Optional.of(name) : Optional.empty();
						
						if(str.isPresent())
						{
							System.out.println("Name: "+str.get());
						}
						else
						{
							System.out.println("objech has the null value");
						}
						
						optEmp.ifPresent(e -> System.out.println(e.getEmpName()));
						optEmp.orElse(new Employee("NA", null));
						optEmp.orElseThrow(() -> new RuntimeException("Exception occured"));
					}
					
					catch(RuntimeException exp){
						
						exp.getMessage();
						
						
					}
					
					
					
					
					}
}
