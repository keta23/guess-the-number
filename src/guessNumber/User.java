package guessNumber;

import java.util.UUID;

public class User {
	String id;
	String name;
	
	
	public User(String name) {
		super();
		this.id = UUID.randomUUID().toString();
		this.name = name;
	}


	public String getId() {
		return id;
	}


	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void notifyuser(String message) {
		
		System.out.println(this.name +" got "+ message);
		
		
	}
	
	
	
	
	
	
}
