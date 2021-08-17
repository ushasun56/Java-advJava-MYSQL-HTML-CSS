//*Finding Simple Interset by Given valuse from User*//

import java.util.Scanner;
public class SimpleInterset
{
   public static void main(String args[])
  {
     float p,n,r;
     float interset;
    Scanner scan = new Scanner(System.in);
    System.out.print(" enter the principal : ");
    p = scan.nextFloat();
   System.out.print(" Enter the interset rate :");
    r =scan.nextFloat();
   System.out.print(" Enter the Time:");
    n =scan.nextFloat();
   scan.close();
  interset = (p*r*n) / 100;
  System.out.print(" simple interset: " +interset);
}
}