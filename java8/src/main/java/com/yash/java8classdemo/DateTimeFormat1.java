package com.yash.java8classdemo;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * java 8 Time Date Format Api
 * @author usha.more
 *
 */

public class DateTimeFormat1 
{
       public static void main(String[] args)
       {
    	   //Instant Creation for Time and Time Format
    	   Instant i3=Instant.now();
    	  Instant i= Instant.now(); //retrun universal time utc
    	  System.out.println("instant creation:"+i);
    	  
    	  Instant i1= Instant.MIN; //1billion ago
    	  System.out.println("instant 1billion Years ago creation:"+i1);
    	  
    	  Instant i2= Instant.MAX; //1billion ago
    	  System.out.println("instant maximum creation:"+i2);
    	  
    	  //Duration is period of time between two instance and it count in time amount
    	  Duration d=Duration.between(i3, i1);
    	  System.out.println("Duration:"+d.getSeconds());
    	  
    	  //Local date only date and  local time is get only time
    	  LocalDate CurrentDate=LocalDate.now();
    	  System.out.println("date in java8:"+CurrentDate);
    	  
    	  //period count in days amount
    	  LocalDate birthdate=LocalDate.of(1996,03, 28);
    	  Period p=Period.between(CurrentDate, birthdate);
    	  System.out.println("Period Between:"+p.getYears());
    	  
    	  //LocaldateTime
    	  LocalDateTime l=LocalDateTime.now();
    	  System.out.println("LocaldateTime:"+l);
    	  
    	  //Date time Formatter
    	  DateTimeFormatter af= DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm");
    	  LocalDateTime ld=LocalDateTime.now();
    	  String formattedString=ld.format(af);
    	  System.out.println("Formated date:"+formattedString);
    	  
    	  //Zoneid
    	  ZoneId zi=ZoneId.systemDefault();
    	  System.out.println("Zone:"+zi);
    	  
    	  //zonedatetime
    	  ZoneId zi1=ZoneId.systemDefault();
    	  ZonedDateTime zdt=ZonedDateTime.now(zi1);
    	  System.out.println("defaultzone date time:"+zdt);
       }
}
