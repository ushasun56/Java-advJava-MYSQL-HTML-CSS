package simpledemo;

public class Payment implements Runnable
{
     private int balance=3000;
     double price;
     
    		 
	@Override
	 synchronized public void run() {
		System.out.println("do payment here");
		
	}

	 synchronized	public  void start() {
		System.out.println("do payment here.......................");
		System.out.println("Totall Amount in bank:"+balance);
		
		
		ProductList p1=new ProductList(3, "handwash", 2, 200);
		System.out.println("product price:"+p1.price);
		
		price=balance-p1.price;
		System.out.println(" amount in your account:"+price);
		
	 }
}
