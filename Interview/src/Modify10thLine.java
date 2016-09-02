import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class Modify10thLine {

	public static void main(String[] args) {

		try{
			FileReader file1 = new FileReader("E:/New folder/Collections/Interview/src/hello.txt");
			BufferedReader f = new BufferedReader(file1);
			String temp = null;
			int i =0 ;
			while((temp=f.readLine()) !=null)
			{
				i++;

				if(i==10)
				{
					try{
						FileWriter file2 = new FileWriter("E:/New folder/Collections/Interview/src/hellore.txt",true);
						BufferedWriter file3 = new BufferedWriter(file2);
						file3.write("your text");
						file3.close();
					}
					catch(Exception e)
					{}
				}
			}
			f.close();
		}
		catch(Exception e)
		{}
	}
}
