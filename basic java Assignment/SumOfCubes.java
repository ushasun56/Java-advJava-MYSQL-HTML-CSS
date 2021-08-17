import java.util.Scanner;

public class SumOfCubes 
{
	public static void main(String args[]) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		for(int i=0;i<num+1;i++) {
			System.out.println(i*i*i);
		}
		
	}
}