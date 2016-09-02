import java.util.Scanner;
public class Test1 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		Long number = scn.nextLong();
		String num = number.toString();
		if(num.length()>10)
		{
			System.out.println(num.substring(0,10));
		}
		else if(num.length()<10)
		{
			System.out.println(("0000000000" + num).substring(num.length()));

		}
	}
}
