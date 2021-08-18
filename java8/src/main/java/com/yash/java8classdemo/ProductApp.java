package com.yash.java8classdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class is created for the stream api use in collection
 * @author usha.more
 *
 */

public class ProductApp
{
	public static void main(String[] args)
	{
		ArrayList<Product> arr=new ArrayList<Product>();
		arr.add(new Product(1,"tv",3000));
		arr.add(new Product(2,"mobile",2000));
		arr.add(new Product(3,"remote",300) );
		arr.add(new Product(4,"fridge",25000));
		arr.add(new Product(5,"washin machin",30000));
		System.out.println(arr);
		
		
		ArrayList<Double> productprice=(ArrayList<Double>)arr.stream()
				//.filter(p->p.price<=3000)
				//.limit(1)
				.map(p->p.price)
				.collect(Collectors.toList());
				System.out.println(productprice);
		
		long count=arr.stream()
				.count();
		System.out.println(count);
		
		
	}

}
