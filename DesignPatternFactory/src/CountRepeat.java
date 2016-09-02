import java.util.*;

class CountRepeat
{

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		String find=s.nextLine();
		int count=0;
		int k=0;
		for(int i=0;i<st.length();i++)
		{
			k=st.indexOf(find,k+find.length());
			if(k==-1) 
				break; 
			else count++;
		}
		System.out.println("The string occurred "+count+" times");
	}
}