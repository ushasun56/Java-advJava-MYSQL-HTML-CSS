package simpledemo;

public class ConformPayment implements Runnable
{

	@Override
	 synchronized public void run() {
		System.out.println("payment is confirm");
		
	}

	 synchronized public void start() {
		System.out.println("payment is confirm............");
	}

}
