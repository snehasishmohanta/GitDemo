import java.util.Scanner;


public class WordOccuranceForLoop 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String sentence = scn.nextLine();

		String [] word = sentence.split(" ");

		int counter = 0;

		for(int i=0;i<word.length;i++)
		{
			counter = 0;
			for(int j=0;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					if(j<i)
					{
						break;
					}
					counter++;
				}
			}
			if(counter>1)
				System.out.println(word[i] +"=="+counter);
		}

	}
}
