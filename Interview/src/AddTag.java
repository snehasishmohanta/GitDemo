import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


public class AddTag {

	public static void main(String[] args) {
		File folder = new File("C:\\Users\\TUBU\\Desktop\\xmlfiles\\");
		File listOfFiles [] =folder.listFiles();
		String fileName = null;
		for(int i=0;i<listOfFiles.length;i++)
		{
			fileName = listOfFiles[i].getName();
			try{
				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
				Document doc = docBuilder.parse(folder+"\\"+fileName);
				System.out.println(doc); // op:-[#document: null]
				Node address = doc.getElementsByTagName("address").item(0);
				if (address == null)
				{
					Node student = doc.getElementsByTagName("Student").item(0);
					Element address1 = doc.createElement("address");
					student.appendChild(address1);

					Element place = doc.createElement("place");
					address1.appendChild(place);

					Element line1 = doc.createElement("line1");
					line1.appendChild(doc.createTextNode("Some Lane"));
					place.appendChild(line1);

					TransformerFactory transformerFactory = TransformerFactory.newInstance();
					Transformer transformer = transformerFactory.newTransformer();
					DOMSource source = new DOMSource(doc);
					StreamResult result = new StreamResult(new File(folder+"\\"+fileName));
					transformer.transform(source, result);
					System.out.println("** done **");
				}
				Element place = doc.createElement("place");
				address.appendChild(place);

				Element line1 = doc.createElement("line1");
				line1.appendChild(doc.createTextNode("Some Lane"));
				place.appendChild(line1);

				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(folder+"\\"+fileName));
				transformer.transform(source, result);
				System.out.println("Done");
			}
			catch(Exception e)
			{
			}
		}

	}


}
