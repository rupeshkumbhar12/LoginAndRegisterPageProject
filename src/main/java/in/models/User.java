package in.models;

public class User {
	
	private String name;
	private  String email;
	private String city;
	private String password;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String string) {
		this.password = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
