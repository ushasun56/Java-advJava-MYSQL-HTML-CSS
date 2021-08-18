package simpledemo;
/**
 * creating simple demo for the multitreading using interface
 * @author usha.more
 *
 */


class First  implements Runnable                                        // extends   //Thread
{
  // public First(String string, ThreadGroup g1) {
		// TODO Auto-generated constructor stub
	//}


public  synchronized void run()
   {
	   try {
		   Thread.sleep(1000);
	    System.out.println("thread is running......"+Thread.currentThread().getId());
	    System.out.println("thread is running......"+Thread.currentThread().getName());
	    
	    Thread.sleep(1000);     //achive sleep Thred  concept
   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   }
   
   
	public static void main(String[] args) throws InterruptedException 
	{
		
		First f=new First();
		Thread t1=new Thread(f,"1st Thread");
		Thread t2=new Thread(f,"2nd Thread");
		Thread t3=new Thread(f,"3rd Thread");
		
		/*ThreadGroup g1 = new ThreadGroup("parent thread group"); 
		First thread1 = new First("Thread-1", g1);  
        First thread2 = new First("Thread-2", g1);  
        System.out.println("number of active thread: "+ g1.activeCount()); 
          
         thread1.start();
          thread2.start();*/
         
		t1.start();
		System.out.println("T1 is alive:"+t1.isAlive());//check t1 is alive or not 
		System.out.println("T1 priority:"+t1.getPriority());
		//t1.join();
		
		
		t2.start();
		//t2.notify();
		//t2.join(); 
		System.out.println("T2 priority:"+t2.getPriority());
		  
		t2.interrupt();  //interrupt thred t2
		System.out.println("is thread interrupted..: "+t2.isInterrupted());
		
		
		System.out.println("T3 priority:");
		t3.setPriority(10);
		t3.start();
		t3.suspend();  //thred is not execute
		t3.resume();  
		
		//t3.join();
		System.out.println("T1 is alive:"+t1.isAlive()); //after all execution t1 is alive or not
		
		
		t1.getState();
		//System.out.println("set ");
		
	
		
		
		//t2.interrupt();
		
		//System.out.println("2nd tread is resume");
	   // t2.resume();
	
		
		
		
		
	}


	
		
	}
   
   

