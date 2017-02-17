package standard;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
//import javax.xml.bind.Marshaller;


import com.ibm.ia.xmlns._default.rsa_demobank_bom.model.ObjectFactory;
import com.ibm.ia.xmlns._default.rsa_demobank_bom.model.Option;
import com.ibm.ia.xmlns._default.rsa_demobank_bom.model.WebImpulse;

/**
 * Servlet implementation class EventReciever
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/EventReciever" })
public class EventReciever extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventReciever() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Event Receiver Servet - received event via 'POST'");
		
		String xmlEventContent = null;
	    StringBuilder stringBuilder = new StringBuilder();
	    BufferedReader bufferedReader = null;
	    
	    try{
	    	
	    	InputStream inputStream = request.getInputStream();
	    	if(inputStream != null){
	    	
	    	Reader reader = new InputStreamReader(inputStream, "ISO-8859-1");
	    	
	    	JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);
        	Unmarshaller unmarshaller = jc.createUnmarshaller();
        	JAXBElement je = (JAXBElement) unmarshaller.unmarshal(reader);        	
	    	
	    	if ("com.ibm.ia.xmlns._default.rsa_demobank_bom.model.WebImpulse".equals(je.getDeclaredType().getName())) {
        		WebImpulse action = (WebImpulse) je.getValue();
        		//System.out.println("Message: " + action.getMessage());
    	    	//System.out.println("Reason: " + action.getReason());
    	    	//System.out.println("Client: "+action.getClient());
    	    	/**
    	    	displayMessage display = new displayMessage();
    	    	display.setClientnr(action.getClient());
    	    	display.setDisplaytext(action.getMessage());
    	    	display.setImpuls(action.getReason());
    	    	**/
        		IncomingImpuls imp = new IncomingImpuls();
        		imp.setClientnr(action.getClient());
        		imp.setChannel("Online");
        		imp.setimpName(action.getImpulseName());
        		WebSocketIndexPage.getImp(imp);
    	    	
    	    	
    	    
    	    	ArrayList<String> sendlist = new ArrayList<String>();
    	    	
    	    	sendlist.add(action.getMessage());
    	    	
    	    	List<Option> options =action.getOption();
    	    	
    	    	Iterator i = options.iterator();
    	    	
    	    	while(i.hasNext()) {
    	    		Option o = (Option)i.next();
    	    		sendlist.add(o.getText());
    	    	}
 
    	    	
    	    	
    	    	
    	    	
    	    	WebSocketIndexPage.Options(sendlist);
    	    	
    	    	//EchoServer.Message(action.getMessage());
    	    	
    	    	
        	} else {
        		System.out.println("must have received something else: " + je.getDeclaredType().getName());
        	}
	    	}
	    	
	    } catch (Exception e){
   e.printStackTrace();
	    
	} finally {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException ex) {
                throw ex;
            }
        }
    }		
	}

}
