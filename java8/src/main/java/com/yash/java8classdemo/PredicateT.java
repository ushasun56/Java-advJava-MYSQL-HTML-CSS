package com.yash.java8classdemo;

import java.util.function.Predicate;

/**
 * 
 * Predicate function id inbuit function with function interface
 * @author usha.more
 *
 */
public class PredicateT 
{
	public static  void main(String[] args)
	{
		Predicate<Integer> lesserthan = i-> (i<18);
				
			System.out.println(lesserthan.test(20));//predicate interface have test() method
				
	}

}
