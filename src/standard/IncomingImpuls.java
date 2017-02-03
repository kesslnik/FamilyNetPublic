package standard;

public class IncomingImpuls {
	
	public static String displaytext;
	public static String clientnr;
	public static String impuls;
	public static String name;
	public static String channel;
	
	public IncomingImpuls() {
		// TODO Auto-generated constructor stub
		
	}

	public static String getDisplaytext() {
		return displaytext;
	}

	public static String getChannel() {
		return channel;
	}
	public void setimpName(String name){
		this.name = name;
	}
	public static String getName(){
		return name;
	}
	
	
	public void setDisplaytext(String displaytext) {
		this.displaytext = displaytext;
	}

	public String getClientnr() {
		return clientnr;
	}

	public void setClientnr(String clientnr) {
		this.clientnr = clientnr;
	}

	public String getImpuls() {
		return impuls;
	}

	public void setImpuls(String impuls) {
		this.impuls = impuls;
	}
	
	public void setChannel(String channel){
		this.channel = channel;
	}
	

}
