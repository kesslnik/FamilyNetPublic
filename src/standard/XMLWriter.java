package standard;
import java.io.File;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;

import com.ibm.ia.xmlns._default.rsa_demobank_bom.model.ClientReaction;

import java.io.StringWriter;



public class XMLWriter {
	
	
	
	
		
	
	
	
	 public static String jaxbObjectToXMLString(User user) {
		  String responseString;
		  JAXBContext context;
	        try {
	        	context = JAXBContext.newInstance(User.class);
	            Marshaller m = context.createMarshaller();
	            //for pretty-print XML in JAXB
	            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	            
	            // Write to System.out for debugging
	            StringWriter sw = new StringWriter();
	            
				m.marshal(user, sw );
	            responseString =sw.toString();

	            return responseString;
	            // Write to File
	            //m.marshal(user, new File("text.xml"));
	          
	        } catch (JAXBException e) {
	            e.printStackTrace();
	            responseString = "Fehler bei XML-Erstellung";
	            return responseString;
	        }
	    }
	 
	
	 
	 
	 
	 public static String JAXBtoXMLString(ClientReaction rc){
		 JAXBContext context1;
		 String tmp;
		try {
			context1 = JAXBContext.newInstance(ClientReaction.class);
			Marshaller m1 = context1.createMarshaller();
			m1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			
			
			StringWriter sw1 = new StringWriter();
			
			m1.marshal(rc, sw1);
			tmp = sw1.toString();
			return tmp;
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Fehler bei der XML-Erstellung";
		}
         
		 
		 
	 }
	
	
}
