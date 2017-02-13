package standard;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


import com.ibm.ia.xmlns._default.rsa_demobank_bom.model.*;

import java.io.StringWriter;



public class XMLWriter {
	
	
	
	
		
	
	
	
	 public static String jaxbObjectToXMLString(User user) {
		  String responseString;
		  JAXBContext context;
	        try {
	        	context = JAXBContext.newInstance(LoginEvent.class);
	            Marshaller m = context.createMarshaller();
	            //for pretty-print XML in JAXB
	            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	            m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.ibm.com/ia/xmlns/default/RSA_DemoBank_BOM/model model.xsd");
	           
	            
	            LoginEvent e = new LoginEvent();
	            e.setChannel(user.getChannel());
	            e.setDatetime(user.getDate());
	            e.setClient(user.getSession());
	            
	            
	            // Write to System.out for debugging
	            StringWriter sw = new StringWriter();
	            
				m.marshal(e, sw );
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
