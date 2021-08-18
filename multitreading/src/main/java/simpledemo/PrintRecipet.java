package simpledemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintRecipet implements Runnable
{

	
	@Override
	 synchronized	public void run() {
		System.out.println("recipet");
		
	}

	 synchronized	public void start() {
	
		System.out.println("recipet................................................");
		
		ProductList p2=new ProductList(3, "handwash", 2, 200);
		System.out.println("Product List:"+p2);
		
		
		ProductList p3=new ProductList(3, "handwash", 2, 200);
		System.out.println("Total Bill:"+p3.price);
		
		
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println("Date:"+dtf.format(now));  
		
	}

}
