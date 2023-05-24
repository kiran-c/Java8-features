package com.orakle.functionalInterface;

public class FnIntMain {

	public static void main(String[] args) {
	
IAmFunctionalInterface obj = () -> {
			
			System.out.println("i'am the Functional Interface");	
		};
		
		obj.absFunc1();
		obj.defaultMeth1();
		obj.defaultMeth2();
 

	}

}
