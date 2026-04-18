package in.bankapp;

public class LoginFailedException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Logged in fail";
	}
}
