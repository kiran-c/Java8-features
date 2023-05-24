package com.orakle.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

//just added 

public class DateTimeFour {

	public static void main(String[] args) {
	
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId zoneName = ZoneId.of("America/Los_Angeles");
		System.out.println(LocalDateTime.now(zoneName));
		
		ZoneId zoneGMT = ZoneId.of("GMT+05:30");
		System.out.println(LocalDateTime.now(zoneGMT));
		
	}

}
