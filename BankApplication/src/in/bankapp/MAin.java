package in.bankapp;

import java.util.Scanner;

public class MAin {

	public static void main(String[] args) {

		BankInterface bi = new BankImplement();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. Create Account");
			System.out.println("2. LOgin");
			System.out.println("3. Exit");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the name");
				String name = sc.next();
				System.out.println("Enter the password");
				String pass = sc.next();
				Account a = new Account(name, pass);
				bi.createAccount(a);
				break;
				
			case 3:
				System.out.println("Thank you");
				System.exit(0);
			default:
				 System.out.println("Invalid login Actions");
			}
		}
	}

}
