package com.yash.java8classdemo;
/**
 * java 8 finctional interface concept
 * @param args
 */

@FunctionalInterface
interface Empolyee
{
    public  void showid(); //abstract method one
     default  void show()  //in functional interface have default method also(non abstract method)
     {
    	 System.out.println("deafult show method");
     }
     static void showName() //functional interface have static method 
     {
    	 System.out.println("my name is Functional interface");
     }

}


public class FunctionInterface implements Empolyee {

	public static void main(String[] args) 
	{
		 FunctionInterface f=new  FunctionInterface();
		 f.showid();
         f.show(); 
         Empolyee.showName(); //static method instance creation
         f.showName();        //call static method for override
	} 

	@Override
	public void showid() {
		System.out.println("have  one abstract method called functional interface");
		
	}
	
	public void show()  //get output is refernce only ths method instance of interface method
	{
		System.out.println("override method show() which is define in interface");
	}
    public void showName()
    {
    	System.out.println("Override static method in functional interface");
    }
}
