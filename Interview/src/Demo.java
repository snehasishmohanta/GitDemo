import java.io.File;



public class Demo {

    public static void main(String[] args) {
            String content = "03000001da00000001666666";
           try{
            File file = new File("E:/New folder/Collections/Interview/src/demo.txt");
            if(!file.exists()){
    			file.createNewFile();
    		}
            String firstIndex = content.substring(0, 10);
            String requireIndex = content.substring(10,18);
            String lastIndex  = content.substring(18, content.length());
           for(int i = 0; i <= 100;i++){
        	 String data =  String.format("%s%08d%s%n",firstIndex, Integer.parseInt(requireIndex)+i, lastIndex);
           }
           
        }
        catch (Exception e) {
			}
        } 
           
    }

