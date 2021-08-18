package com.yash.java8classdemo;


import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDate;
public class StudentApp 
{
	

	

	public static void main(String[] args)
	{
		ArrayList<Student> stu=new ArrayList<Student>();
		stu.add(new Student(1,"usha","IT",LocalDate.of(1996,Month.APRIL,28),"pune",70));
		stu.add(new Student(2,"swapnali","IT",LocalDate.of(1989,Month.FEBRUARY, 12),"pune",75));
		stu.add(new Student(3,"swati","Co",LocalDate.of(1995, Month.AUGUST, 15),"solapur",72));
		stu.add(new Student(4,"soham","mechnical",LocalDate.of(1982,Month.JULY,16),"mumbai",80));
		stu.add(new Student(5,"nikita","Civil",LocalDate.of(1991, Month.MARCH, 23),"pune",68));
		stu.add(new Student(6,"varsha","IT",LocalDate.of(1994, Month.MAY, 19),"latur",77));
		System.out.println(stu);
	
		
		ArrayList<Integer> marks=(ArrayList<Integer>) stu.stream()
				.map(s->s.getMarks())
				.collect(Collectors.toList());
		System.out.println("Student marks:"+marks);
		
		ArrayList<String> markid=(ArrayList<String>) stu.stream()
				.filter(s->s.getAddress()=="pune")
				.map(n->n.getSname())
				
			    .collect(Collectors.toList());
			    System.out.println("Same Address name:"+markid);
		
			
			
			   
		
		
	}

	/*private static void flatMap(ArrayList<Integer> marks, ArrayList<String> markid) {
		List<String> newList=Stream.of(marks,markid)
				.flatMap(Collection::stu)
				.collect(Collectors.toList());*/
	}

	

	
	





