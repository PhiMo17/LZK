
import java.io.IOException;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class kassenbonmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Artikelname = null;
		double Preis;/* = Double.parseDouble("str");*/
		int Bestand;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("C:\\Users\\phill\\Kassenbon\\Kassenbon\\src\\ArtikelListe.xml");
			NodeList articleList = doc.getElementsByTagName("Artikel");
			
			for(int i=0; i<articleList.getLength(); i++) {
				Node aL = articleList.item(i);
				
				if(aL.getNodeType() == Node.ELEMENT_NODE) {
					Element Artikel = (Element) aL;
					String id = Artikel.getAttribute("id");
					
					NodeList ArtAttributes = Artikel.getChildNodes();
					
					System.out.println(ArtAttributes.getLength());
					
					for(int j=0; j<ArtAttributes.getLength(); j++) {
						System.out.println(j);
						Node Attribute = ArtAttributes.item(j);
						
						Artikelname = ArtAttributes.getElement(Artikelname);
						Preis = ArtAttributes.getElement(Preis);
						Bestand = ArtAttributes.getElement(Bestand);
						/*if(Attribute.getNodeType() == Node.ELEMENT_NODE) {
							Element attribute = (Element) Attribute;
							if(j == 1) {
								Artikelname = attribute.getTextContent();
								System.out.println(Artikelname);
							}
							else if (j == 2) {
								System.out.println(j);
								Preis = Double.parseDouble(attribute.getTextContent());
							}
							else if (j == 3) {
								Bestand = Integer.parseInt(attribute.getTextContent());
							}
							//Element attribute = (Element) Attribute;
							//System.out.println(id + attribute.getTagName() + "=" + attribute.getTextContent());
						}*/
					}
				}
			}
		} 
		
		catch (ParserConfigurationException e) {
			e.printStackTrace();
		} 
		
		catch (SAXException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
