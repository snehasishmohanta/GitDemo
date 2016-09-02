
public class RepeatedWord 
{
	public static void main(String[] args) 
	{
		String sen = "hi hello hi good morning hello";
		String word[] = sen.split(" ");
		int count=0;
		for (int i = 0; i < word.length; i++) 
		{
			count = 0;
			for (int j = 0; j < word.length; j++) 
			{

				if (word[i].equals(word[j]))
				{
					if (j < i) 
					{
						break;
					}
					count++;
				}
			}
			if (count > 1) 
			{
				//System.out.println("the word " + word[i] + " occured " + count + " time");
				System.out.println(word[i]);
			}
		}

	}
}
