package com.cg.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateTimeZone {

	public static void main(String[] args) 
	{
		LocalTime t=LocalTime.now(ZoneId.of("Egypt"));
		LocalDateTime df=LocalDateTime.now(ZoneId.of("Egypt"));
		System.out.println(t);
		System.out.println(df);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}

	}

}
