package simpledemo;



public  class ShoppingProduct implements Runnable
{
 
	@Override
	 synchronized public void run() {
		System.out.println("in the main class");
		
	}
	
	public static void main(String args[])
	{
		 ProductList pl1=new  ProductList(0, null, 0, 0);//product list thread
		Thread t1=new Thread(pl1);
		
		 

		AddProduct ap=new  AddProduct();//product list thread
		Thread t2=new Thread(ap);
		
		

		VerifyCrat vc=new  VerifyCrat(null, 0);//product list thread
		Thread t3=new Thread(vc);
		
		
		
		 Payment p=new   Payment();//product list thread
		Thread t=new Thread(p);
	
		 ConformPayment cp=new   ConformPayment();//product list thread
		Thread t5=new Thread(cp);
		
		
		 PrintRecipet pp=new   PrintRecipet();//product list thread
		Thread t6=new Thread(pp);
		
		
		pl1.start(); 
		ap.start();
		vc.start();
		p.start();
		cp.start();
		pp.start();
		
		
		
		 
	}
  
}
   
	
  
  


