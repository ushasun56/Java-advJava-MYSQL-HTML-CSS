package simpledemo;

public class VerifyCrat implements Runnable
{
	
	private String Name;
	private long CardNo;
	
	

	public VerifyCrat(String name, long cardNo) {
		super();
		Name = name;
		CardNo = cardNo;
	}
	
	

	@Override
	public String toString() {
		return "VerifyCrat [Name=" + Name + ", CardNo=" + CardNo + "]";
	}



	@Override
	 synchronized public void run() {
		System.out.println("verify my cart");
		
	}

	 synchronized	public void start() {
		System.out.println("verify my cart.......................");
		
		VerifyCrat vc1=new VerifyCrat("XYZ",12345);
		System.out.println(vc1);
		System.out.println("Card verify successful");
	}

}
