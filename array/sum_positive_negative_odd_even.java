package positivenegativeoddeven;
import java.util.*;
import java.lang.*;

public class sum_positive_negative_odd_even 
{

	public static void main(String[] args)
	{
		
		int i,x,a[] = new int[10];
		
		int n=0,p=0,e=0,o=0;

		
		Scanner input = new Scanner(System.in);

		
		for(i=0;i<5;i++)
		{
		 System.out.println("Enter Number :");
		 a[i] = input.nextInt();
		}

	
		for(i=0;i<5;i++)
		{
			if(a[i]<0)
				n++;
			else
				p++;

			x=a[i]%2;
			if(x==0)
				e++;
			else
				o++;
		}

		//print
		System.out.println("Total Even Numbers = "+e);
		System.out.println("Total Odd Numbers = "+o);
		System.out.println("Total Negative Numbers = "+n);
		System.out.println("Total Positive Numbers = "+p);
	}
}

	
	

		

	


