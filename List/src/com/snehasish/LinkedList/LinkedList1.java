package com.snehasish.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add("1st");
		list.add(1, "element");
		list.addFirst("0");
		list.addLast("3");
		System.out.println(list);
		System.out.println(list.contains("3"));
		System.out.println(list.offer("5"));
		System.out.println(list.offerFirst("off"));
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.pollFirst());
		System.out.println(list);
		System.out.println(list.pollLast());
		System.out.println(list);
		System.out.println(list.pop());

		Iterator iterator = list.iterator();

		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
