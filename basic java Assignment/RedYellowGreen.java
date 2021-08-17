import java.util.Scanner;

public class RedYellowGreen 
{
	public static void main(String args[]) 
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter red for stop");
		System.out.println("Enter yellow for ready");
		System.out.println("Enter green for Go");
		
		String i=scanner.nextLine().toLowerCase();
		if(i.contains("red")) {
			System.out.println("Stop");
		}
		else if(i.contains("yello")){
			System.out.println("Ready");
		}
		else if(i.contains("green")){
			System.out.println("Go");
		}
		else {
			System.out.println("you entered the invalid value");
		}
	}
}