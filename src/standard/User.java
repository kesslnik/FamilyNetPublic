package standard;
import java.util.Date;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "LoginEvent")
@XmlType(propOrder = {"channel", "uname", "date"})

public class User {
	
	String channel;
	String uname;
	Date date;

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

	@XmlElement(name = "client")
	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}

	@XmlElement(name = "date")
	public Date getDate() {
		return date;
	}

	
	public void setDate(Date date) {
		this.date = date;
	}

}
