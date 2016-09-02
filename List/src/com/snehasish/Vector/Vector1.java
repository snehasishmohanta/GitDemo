package com.snehasish.Vector;

import java.util.Vector;

public class Vector1 
{
	public static void main(String[] args) 
	{
		Vector vector = new Vector();
		vector.add("1st position");
		vector.addElement("2nd position");
		vector.add(1, "element");
		vector.add(null);
		vector.addElement(null);
		vector.add(null);
		vector.addElement(null);
		System.out.println(vector);

		System.out.println(vector.capacity());
		System.out.println(vector.elementAt(1));
		System.out.println(vector.firstElement());
		System.out.println(vector.isEmpty());
		System.out.println(vector.lastElement());
		System.out.println(vector.remove("element"));

		System.out.println(vector);

		System.out.println(vector.capacity());
		System.out.println("*#*#*#*#**#*#*#*#*#*#*#*");
		for(Object obj:vector)
		{
			System.out.println(obj);
		}
	}
}
