
public class DebugTests {
	static String las = "";
	public static void main(String[] args) {

		String s =  "hello";
		String err = "?";
		String newD =s+ " dear";
		
		 las = newD+ " how are you"+err;
		las = las.replaceAll("[^a-z]", "");
		 String res = add(las); 
		 System.out.println(res);
		
	}
	public static String add(String string){
		String after = "hmm "+las;
		return after;
		
	}

}
