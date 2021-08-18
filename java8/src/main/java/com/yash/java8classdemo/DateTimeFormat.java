package com.yash.java8classdemo;
import java.util.Calendar;
/**
 * java 7 DATE and TIME API 
 */
import java.util.Date;  //this packages which have date class 
import java.util.TimeZone;
import java.text.*;     //customize the date and time format 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormat {

	public static void main(String[] args) {
		
		//java .util.date
		Date date=new Date();    //date class object creation
		System.out.println("Day Month Time  Year:"+date.toString());   //using tostring method in java 7
		
		System.out.println(date.getTime());   //retrun time in milisenconds
		
		System.out.println("Year:"+1900+date.getYear()); //simillary we can use getday(),getHours(),getMinutes()
		
		
		//java.text.simpledate formate
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println("Date:"+dtf.format(now)); 
		   
		   //system.currentTimemilles
		 System.out.println("Time in Milisencond:"+System.currentTimeMillis());//milisencond  

		 
		 //java.sql.date  use in JDBC java 7
		 long millis=System.currentTimeMillis(); //introduce also in java 7 use in JDBC 
	        java.sql.Date date1=new java.sql.Date(millis);  
	        System.out.println(date1);  
		 
	        //java.util.calendar
	        Calendar cal = Calendar.getInstance();
	        System.out.println("Current year is :" + cal.getTime());
	        
	        //set the date
	        cal.set(2021, 8, 04);
	        System.out.println("Altered year is :" + cal.getTime()); 
	        
	       /* String[] id = TimeZone.getAvailableIDs();        
	        System.out.println("In TimeZone class available Ids are: ");  
	        for (int i=0; i<id.length; i++){  
	        System.out.println(id[i]);  */

	}
	}



