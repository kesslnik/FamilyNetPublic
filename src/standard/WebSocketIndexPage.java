package standard;

import javax.websocket.server.ServerEndpoint;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.ibm.ia.xmlns._default.rsa_demobank_bom.model.ClientReaction;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

/**
 * Websocket Endpoint implementation class WebSocketIndexPage */

@ServerEndpoint("/WebSocketIndexPage")
public class WebSocketIndexPage {
	public static Session session;
	
public static int clientnr =0;
	
	public static ClientReaction rc;
	 
    
    public WebSocketIndexPage() {
        super();
        // TODO Auto-generated constructor stub
        
        
    }
   
    
    
    
    @OnOpen
    public void onOpen (Session session1){
    	session = session1;
    	System.out.println(session1.getRequestURI());
    	
    	if(clientnr<2){
    	User k = new User();
		k.setApplication("family-net");
		k.setChannel("Family-net Hypothek");
		try {
			k.setDate(getXMLGregorianCalendarNow());
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		k.setSession(session.getId());
		String xmlString = XMLWriter.jaxbObjectToXMLString(k);
		System.out.println(sendEvent(xmlString));
		clientnr++;
    	}else{
    		System.out.println("Client Event bereits erstellt");
    	}
		
    	
    	
    	
    }
    
    
    @OnMessage
    public static void onMessage(String message, Session session){
    	System.out.println(message);
    
    	rc.setReaction(message);
    	
    	
    	try {
			rc.setDatetime(getXMLGregorianCalendarNow());
		} catch (DatatypeConfigurationException e) {
			 
			e.printStackTrace();
		}
    	sendEvent(XMLWriter.JAXBtoXMLString(rc));
    	
    	
        
       // try {
         //   session.getBasicRemote().sendText(message);
       // } catch (IOException ex) {
        //    ex.printStackTrace();
       // }
    }
    
   
    public static void Options(ArrayList<String> s) {
    	
    	if(s.size()==4){
    	
    	JsonObject object = Json.createObjectBuilder()
    			.add("message",s.get(0))
    			.add("button1",s.get(1))	
    			.add("button2", s.get(2))
    			.add("button3", s.get(3))
    			.build();
    	sendOptions(object);
    			
    }else if (s.size()==3){
    	
    	JsonObject object = Json.createObjectBuilder()
    			.add("message",s.get(0))
    			.add("button1",s.get(1))	
    			.add("button2", s.get(2))
    			.build();
    	sendOptions(object);
    	
    	
    }
    	
    	
    	else{
    	System.out.println("fuuuucking Fail");
    }
    }
    	
    	
    public static void sendOptions(JsonObject o) {
    	
    	try{
    		System.out.println("sending " + o );
    		String z = o.toString();
    		System.out.println(z);
    		session.getBasicRemote().sendText(z);
    }catch(IOException o1){
    	o1.printStackTrace();
    
    }
    }  
    	
    public static void getImp(IncomingImpuls ac){
    	rc = new ClientReaction();
    	rc.setChannel(ac.getChannel());
    	rc.setClient(ac.getClientnr());
    	rc.setLastImpulseName(ac.getName());
    	
    }
    
    
    
    
    
    public static boolean sendEvent(String xml) {
		String url = "http://127.0.0.1:8080/service/LoginEvent";
		boolean success;
		   try {
		      System.out.println("Connecting to: " + url);
		      HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		      try {
		         conn.setRequestProperty("Content-Type", "application/xml");
		         conn.setDoInput(true);
		         conn.setDoOutput(true);
		         
		         System.out.println("Posting file: " + xml);
		         
		         int len = xml.length();
		         byte[] b = new byte[len];
		         b = xml.getBytes();
		         
		         try {
		            OutputStream requestStream = conn.getOutputStream();
		            requestStream.write(b);
		            requestStream.close();
		            } catch (Exception e) {
		            	System.out.println("Something went wrong during sending the event, url=" + url + "\n" + xml);
		            	e.printStackTrace();
		            } 
		      		         
		         int responseCode = conn.getResponseCode();
		         System.out.println("Response code: " +  responseCode);
		         success = (responseCode == 200);
		      } finally {
		         conn.disconnect();
		      }
		   } catch (IOException e) {
		      e.printStackTrace();
		      success = false;
		   }
		   return success;
		
	}

    
    	
 
    /**
     * The user closes the connection.
     * 
     * Note: you can't send messages to the client from this method
     */
    @OnClose
    public void onClose(Session session){
        System.out.println("Session " +session.getId()+" has ended");
        
    }
    
    public static XMLGregorianCalendar getXMLGregorianCalendarNow() 
            throws DatatypeConfigurationException
    {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar now = 
            datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        return now;
    }
    
    
    
    
}




