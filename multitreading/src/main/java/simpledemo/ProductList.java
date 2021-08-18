package simpledemo;

import java.util.ArrayList;

public class ProductList implements Runnable
{
  public int pid;
  public String productname;
  public int productquntity;
  public double price;
  
  
	public ProductList(int pid, String productname, int productquntity, double price) {
	super();
	this.pid = pid;
	this.productname = productname;
	this.productquntity = productquntity;
	this.price = price;
}
	
	
	@Override
	public String toString() {
		return "ProductList [pid=" + pid + ", productname=" + productname + ", productquntity=" + productquntity
				+ ", price=" + price + "]";
	}






	@Override
	 synchronized public void run() {
		
		System.out.println(" product list here...");
	}
	 synchronized	public void start() {
		
		System.out.println(" product list here...");
	     ArrayList<ProductList> arr1=new ArrayList<ProductList>();
	     arr1.add(new ProductList(1,"facewash",2,140));
	     arr1.add(new ProductList(2,"roomfreshaner",4,800));
	     arr1.add(new ProductList(3,"handwash",4,400));
	     arr1.add(new ProductList(4,"shop",12,120));
	     
	     
	     for(ProductList c1:arr1)
			  System.out.println(c1);
	     
	}
	
}
