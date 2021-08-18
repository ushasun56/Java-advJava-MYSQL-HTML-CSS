package simpledemo;

import java.util.ArrayList;

public class AddProduct implements Runnable
{

	//private static final String ProductList = null;

	@Override
	 synchronized public void run() {
		System.out.println("add product here");
		
	}

	 synchronized	public void start() {
		
		System.out.println("add product here..............");
		ProductList p=new ProductList(3, "handwash", 2, 200);
		
	  System.out.println(p);
		
	}

}
