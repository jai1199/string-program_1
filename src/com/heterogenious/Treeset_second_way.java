package com.heterogenious;

import java.util.TreeSet;

public class Treeset_second_way 
{
	//in this way we can add heterogeneious object inside treeset
 public static void main(String[] args) {
	TreeSet<Integer>t1 = new TreeSet<>();
	TreeSet<Double>t2 = new TreeSet<>();
	TreeSet<String>t3= new TreeSet<>();
	TreeSet<Boolean>t4 = new TreeSet<>();
	t1.add(12);
	t2.add(10.0);
	t3.add("asdd");
	t4.add(true);
	for(int i : t1)
	System.out.println(t1);
	for(double d : t2)
		System.out.println(t2);
	for(String s : t3)
		System.out.println(t3);
	for(boolean b : t4)
		System.out.println(t4);
	
}
}
