package com.yash.java8classdemo;

import java.time.LocalDate;
import java.time.Period;

/**
 * Student Class for Implimented java 8 new Api using lamba Expression Including Tiem and date Api
 * @author usha.more
 *
 */

public class Student 
{
 public int sid;
 public String Sname;
 public String Deptname;
 public LocalDate dob;
 public String Address;
 public int marks;
 
 public Student() {
	super();
}

public Student(int sid, String sname, String deptname, LocalDate dob, String address, int marks) {
	super();
	this.sid = sid;
	Sname = sname;
	Deptname = deptname;
	this.dob = dob;
	Address = address;
	this.marks = marks;
}

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getSname() {
	return Sname;
}

public void setSname(String sname) {
	Sname = sname;
}

public String getDeptname() {
	return Deptname;
}

public void setDeptname(String deptname) {
	Deptname = deptname;
}

public LocalDate getDob() {
	return dob;
}

public void setDob(LocalDate dob) {
	this.dob = dob;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

@Override
public String toString() {
	return "Student [sid=" + sid + ", Sname=" + Sname + ", Deptname=" + Deptname + ", dob=" + dob + ", Address="
			+ Address + ", marks=" + marks + "]";
}
 
 
 
 

 


 

}
