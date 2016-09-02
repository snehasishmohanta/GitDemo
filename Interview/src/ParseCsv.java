import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
public class ParseCsv {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\TUBU\\Desktop\\Book1.csv"));
		String line;
		Map<String, Integer> unique = new TreeMap<String, Integer>();
		while (( line = br.readLine()) != null) {
		    String[] cols = line.split(",");
		    String[] requireData = cols[10].split(" ");
		    for(int i = 0;i<requireData.length;i++){
		    	String data = requireData[i];
		    	unique.put(data, (unique.get(data) == null?1:(unique.get(data)+1)));
		    }
		}
		System.out.println(unique);
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.csv"));
		writer.append(unique.toString());
		writer.close();
		
		
	}

}
