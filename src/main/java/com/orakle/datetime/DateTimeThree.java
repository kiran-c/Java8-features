package com.orakle.datetime;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeThree {

	public static void main(String[] args) {

		LocalDate startDate = LocalDate.of(2012, 12, 24);
		
		LocalDate currentDate = LocalDate.now();
		
		Period period = Period.between(startDate, currentDate);
		System.out.printf("he has %d Years, %d months, %d days of Experience ",period.getYears(), period.getMonths(), period.getDays());

	}

}
