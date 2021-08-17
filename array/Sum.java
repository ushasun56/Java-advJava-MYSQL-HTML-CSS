import java.lang.*;
import java.util.*;
public class Sum 
{
   public static int SumOfSeries(int n)
   {
	   int sum = 0;
	   for(int x=1; x<=n; x++ )
		   sum += x*x*x;
	   return  sum;
   }
   public static void main(String args[])
   {
	   int num = 5;
	   System.out.println(SumOfSeries(n))
   }
}
