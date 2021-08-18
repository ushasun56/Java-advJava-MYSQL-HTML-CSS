package simpledemo;

public class First1 extends Thread
{
	public void run()
	   {
		   try {
			   
		    System.out.println("thread is running......"+Thread.currentThread().getId());
		   
		    
	   }
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }
		   }
	
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++) {
	    	
		First1 f1=new First1();
		Thread t1=new Thread(f1);
		f1.start();
		//t1.start();
		
		}
	}

}
