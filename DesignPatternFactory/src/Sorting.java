import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Sorting 
{
	public static void main(String[] args) 
	{
		int a[] = {1,-1,3,5,2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		String b[] = {"hi","hello","hellow","hie","hmm"};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));

		ArrayList list = new ArrayList();
		list.add("A");
		list.add("b");
		//list.add(1);
		list.add("B");
		list.add("a");
		//list.add(2);
		list.add("1");
		list.add("2");

		Collections.sort(list);
		for(Object obj:list)
		{
			System.out.print(obj);
		}

	}
}
