package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String name;
	private String email;
	private Date bithDath;
	
	public Client() {
		
	}

	public Client(String name, String email, Date bithDath) {
		this.name = name;
		this.email = email;
		this.bithDath = bithDath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBithDath() {
		return bithDath;
	}

	public void setBithDath(Date bithDath) {
		this.bithDath = bithDath;
	}
	
	public String toString() {
		return name + " (" + sdf.format(bithDath) + ") - " + email;
 	}
	
}
