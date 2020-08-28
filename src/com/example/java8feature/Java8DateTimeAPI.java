package com.example.java8feature;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java8DateTimeAPI {

	
		public static void main(String[] args) {
			
			LocalDateTime ldt = LocalDateTime.now();
			
			LocalDate ld = ldt.toLocalDate();
			System.out.println("current Time is :" +ldt);
			System.out.println("Local Date: " +ld);
			DayOfWeek ldt1 = LocalDateTime.now().getDayOfWeek();
			System.out.println(ldt1);
			
		    ZoneId zoneid1 = ZoneId.of("Pacific/Auckland");  

			ZonedDateTime zdt = ZonedDateTime.now(zoneid1);
			System.out.println("Zoned Date Time :" +zdt);
			
			
		}
}
