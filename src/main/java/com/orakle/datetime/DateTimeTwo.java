package com.orakle.datetime;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeTwo {

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println("Before 5 months: "+date.minusMonths(5));
		
		
		LocalTime time = LocalTime.now();
		System.out.println("After 6 Hrs: "+time.plusHours(6));
	}
}
