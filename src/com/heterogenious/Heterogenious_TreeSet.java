package com.heterogenious;

import java.util.TreeSet;

public class Heterogenious_TreeSet 
{
  public static void main(String[] args) 
  {
	TreeSet<Object>t = new TreeSet<Object>();
	t.add(10);
	t.add('a');
	t.add("V");
	t.add(12.00);
	for(Object i : t)
		System.out.println(i);
  }
}
//in this way it gives classcast exception
