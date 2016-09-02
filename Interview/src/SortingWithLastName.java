import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class LastNameComparator implements Comparator<String> {
	public int compare(String b1, String b2) {
		String[] arr1 = b1.split(" ");
		String[] arr2 = b2.split(" ");
		if (arr1.length > 1 && arr2.length > 1)
			return arr1[arr1.length-1].compareTo(arr2[arr2.length-1]);
		else
			return 0;
	}
}
public class SortingWithLastName 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sachin Tendulkar");
		list.add("Sourav Ganguly");
		list.add("Rahul Dravid");
		Collections.sort(list, new LastNameComparator());
		System.out.println(list);
	}
}
