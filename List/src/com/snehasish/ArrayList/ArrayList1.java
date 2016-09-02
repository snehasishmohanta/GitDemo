package com.snehasish.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayList1 
{
	public static void main(String[] args) 
	{
		// list 1
		List l1 = new ArrayList();
		l1.add("2");
		l1.add("tubu");

		//list 2
		List l2 = new ArrayList();
		l2.add("3");
		l2.add("new");

		//list 3
		List list = new ArrayList();
		list.add("1");
		list.add("Snehasish");
		list.add(1, "element");
		list.addAll(l1);
		list.addAll(2, l2);
		list.add("2");

		System.out.println(list);

		// iterating

		Iterator iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("*****************");

		//enhanced for loop

		for(Object object : list)
		{
			System.out.println(object);
		}

		Collections.sort(list);

		System.out.println("#*#*#*#*#*# --- After Sorting ---- *#*#*#*#*#");

		for(Object object : list)
		{
			System.out.println(object);
		}

		System.out.println("Size is "+list.size());
		System.out.println(list.contains("3"));
		System.out.println(list.containsAll(l2));
		System.out.println(list.get(3));
		System.out.println(list.retainAll(l2));


		System.out.println("*#*#*#*#*# ENUMERATION #*#*#*#*#");
		Enumeration enumeration = Collections.enumeration(list);
		while(enumeration.hasMoreElements())
		System.out.println(enumeration.nextElement());
	}
}
