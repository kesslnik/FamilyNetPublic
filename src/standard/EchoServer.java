package standard;

import javax.websocket.server.ServerEndpoint;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import javax.json.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

import com.ibm.ia.xmlns._default.rsa_demobank_bom.model.ClientReaction;

/**
 * Websocket Endpoint implementation class EchoServer */

@ServerEndpoint(value ="/EchoServer")
public class EchoServer {
	public static Session sesionString;
	public static ClientReaction rc;
	
	
    
    public EchoServer() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
    
    @OnOpen
    public void onOpen(Session session){
        System.out.println(session.getId() + " has opened a connection");
        sesionString = session;
        try {
            session.getBasicRemote().sendText(IncomingImpuls.getDisplaytext());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
 
    /**
     * When a user sends a message to the server, this method will intercept the message
     * and allow us to react to it. For now the message is read as a String.
     */
    @OnMessage
    public static void onMessage(String message, Session session){
    	rc.setReaction(message);
    
    	
    	
    	try {
			rc.setDatetime(getXMLGregorianCalendarNow());
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	sendEvent(XMLWriter.JAXBtoXMLString(rc));
    	
    	
        System.out.println(rc.toString());
        try {
            session.getBasicRemote().sendText(message);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void Message(String s){
    	try {
			sesionString.getBasicRemote().sendText(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
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
    	sesionString.getBasicRemote().sendText(z);
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
		String url = "http://127.0.0.1:8080/service/ClientReaction";
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

