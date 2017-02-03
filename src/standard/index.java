package standard;


import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URL;
import java.net.HttpURLConnection;


/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
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
		String uname = request.getParameter("uname");
		String pw = request.getParameter("pw");
		
		
		
		if(uname.equals("Nadine")){
			response.sendRedirect("./home");
			XMLWriter xml = new XMLWriter();
			xml.createUser(uname, "E-Banking");
			System.out.println(sendEvent("x","y",xml.getresponseString()));
		}else{
		response.sendRedirect("NoUserFound.jsp");	
		}
		
		
	}
	
	public boolean sendEvent(String dsiServer, String httpEndpoint, String xml) {
		String url = "http://127.0.0.1:8080/service/loginevent";
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

}
