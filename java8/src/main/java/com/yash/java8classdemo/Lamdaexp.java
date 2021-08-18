package com.yash.java8classdemo;
/**
 * lamda expression in function interface
 * @author usha.more
 *
 */
interface add
{
	//public void number();//empty list
	public int  number(int a,int b);//non empty list 2param
	
}

public class Lamdaexp       //normally class is impliments interface but in lamda function interface not to need write implements
{
  public static void main(String[] args)
  {
	 /* add a=()->{          //empty arguments
		 System.out.println("lamda expression"); 
	  };
	  a.number();*/

	  add a1=(a,b)->{                        
		return a+b;  
	  };
	 System.out.println(a1.number(20, 20));
  }
}
