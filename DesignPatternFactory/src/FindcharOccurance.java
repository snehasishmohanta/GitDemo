import java.util.Scanner;


public class FindcharOccurance 
{
	public static void main(String[] args) 
	{
		char ch;
		int count = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String str = scn.nextLine();
		System.out.println("enter the character to get the occurance");
		String s = scn.next();
		char c=s.charAt(0);
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			if(ch==c)
			{
				count++;
			}
		}
		System.out.println("character "+s+" is available "+ count +" time");
	}
}
