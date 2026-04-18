package in.bankapp;

import java.util.ArrayList;


public class BankImplement implements BankInterface{
	ArrayList<Account> al=new ArrayList();
	Account a=new Account();
	@Override
	public void createAccount(Account a) {
		al.add(a);
		System.out.println("Account created successfuly");
		System.out.println("Login for further actions");
	}


}
