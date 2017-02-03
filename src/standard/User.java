package standard;
import java.util.Date;

import javax.websocket.Session;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement(name = "LoginEvent")
@XmlType(propOrder = {"channel", "application", "session", "date"})

public class User {
	
	String channel;
	String application;
	String session;
	XMLGregorianCalendar date;

	public User() {
		// TODO Auto-generated constructor stub	
		
	}

	@XmlElement(name = "channel")
	public String getChannel() {
		return channel;
	}

	
	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	@XmlElement(name = "application")
	public String getApplication() {
		return application;
	}

	
	public void setApplication(String appl) {
		this.application = appl;
	}

	@XmlElement(name = "session")
	public String getSession() {
		return session;
	}


	public void setSession(String uname) {
		this.session = uname;
	}

	@XmlElement(name = "date")
	public XMLGregorianCalendar getDate() {
		return date;
	}

	
	public void setDate(XMLGregorianCalendar xmlGregorianCalendar) {
		this.date = xmlGregorianCalendar;
	}

}
