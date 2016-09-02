import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test2 
{
	public static void main(String[] args) 
	{
		String line = "This order was placed for QT3000! OK?21lhjh567jkhjkh890";
		String regex = "\\d+";
		List list = new ArrayList();
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(line);
		// to get only first match
		match.find();
		String result1 = match.group();
		//System.out.println(result1);
		// to get all match
		while(match.find())
		{
			/*String result = match.group(0);
			list.add(result);*/
			System.out.println("group 0 "+ match.group());
			//System.out.println( "group 1"+match.group(1));
		}
		//System.out.println(list);
	}
}
