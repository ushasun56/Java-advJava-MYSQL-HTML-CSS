package com.yash.java8classdemo;

public class Product
{
	public int pid;
	public String Pname;
	public double price;
	
	public Product() {
		super();
	}

	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		Pname = pname;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", Pname=" + Pname + ", price=" + price + "]";
	}
	
	
	
	

}
