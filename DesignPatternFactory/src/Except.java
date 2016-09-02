
public class Except 
{
	public static void main(String[] args) 
	{

		try
		{
			int x = 5;
			try
			{
				System.out.println(x/0);
			}

			catch(ArithmeticException ex)
			{
				System.out.println("AE");
				throw ex;
			}
			catch(Exception e)
			{
				System.out.println("e");
				throw e;
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ae");
			throw ae;
		}

		catch(Exception exception)
		{
			System.out.println("Exc");
			throw exception;
		}



	}
}
