package com.orakle.functionalInterface;

@FunctionalInterface
public interface IAmFunctionalInterface {

	public void absFunc1();
	
	default void defaultMeth1()
	{
		System.out.println("This is a Default Method 1");
	}
	
	default void defaultMeth2()
	{
		System.out.println("This is a Default Method 2");
	}
	
	
	public static void staticFn1()
	{
		System.out.println("This is static Fn 1");
	}
	
	
	public static void staticFn2()
	{
		System.out.println("This is static Fn 2");
	}
	
}
