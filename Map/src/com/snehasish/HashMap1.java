package com.snehasish;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("no1","I am no1" );
		map.put("no2", "I am no 2");
		map.put(null, "null iam");
		map.put(null, "2nd null");

		System.out.println(map);
		System.out.println(map.containsKey(null));
		System.out.println(map.containsValue("null iam"));
		System.out.println(map.containsValue("2nd null"));
		System.out.println(map.values());
		


		for(Object key : map.keySet() )
		{
			System.out.println(key+"======"+ map.get(key));
		}

		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext())
		{
			Map.Entry entry = (Entry) iterator.next();
			System.out.println(entry.getKey() +"++++====="+entry.getValue());
		}
	}
}
