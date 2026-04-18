package in.bankapp;

public class Account {
	String name;
	String pass;
	public Account(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public String getPass() {
		return pass;
	}

	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return name+" "+pass;
}
	
	
}
