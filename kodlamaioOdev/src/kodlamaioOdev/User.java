package kodlamaioOdev;

public class User {
	
	public User() {
		
	}
	
	public User(int id,String name,String lastName,String eMail) {
		this();
		this.id=id;
		this.name=name;
		this.lastName=lastName;
		this.eMail=eMail;
	}
	
	int id;
	String name;
	String lastName;
	String eMail;

}
