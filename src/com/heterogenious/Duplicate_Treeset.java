package com.heterogenious;

import java.util.TreeSet;

public class Duplicate_Treeset 
{
  public static void main(String[] args) {
	TreeSet<Object>t = new TreeSet<>();
	t.add(2);
	t.add(8);
	t.add(2);
	t.add(9);
	t.add(8);
	for(Object obj : t )
	System.out.println(obj);
}
}
