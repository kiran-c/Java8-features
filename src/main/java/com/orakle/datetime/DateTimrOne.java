package com.orakle.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTimrOne {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);

		
		LocalDate localDate = LocalDate.now();
		System.out.println("local Date: "+localDate);
		
		
		LocalTime localTime = LocalTime.now();
		System.out.println("local Time: "+localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local Date Time: "+localDateTime);
		
		System.out.println("DayOfMonth: "+localDate.getDayOfMonth());
		System.out.println("MonthValue: "+localDate.getMonthValue());
		System.out.println("Year: "+localDate.getYear());
		System.out.println("DayOfYear: "+localDate.getDayOfYear());
		
		System.out.println("Hour: "+localTime.getHour());
		System.out.println("Minute: "+localTime.getMinute());
		System.out.println("Second: "+localTime.getSecond());
		
		LocalDateTime futureDateTime = LocalDateTime.of(2024, 5, 24, 5, 24, 15);
		System.out.println("futureDateTime: "+futureDateTime);
	}

}
