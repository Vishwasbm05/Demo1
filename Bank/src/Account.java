import java.util.Scanner;

public class Account {
	String aname;
	double bal;
	long accno;
	int pin;
	static long count=11002211345l;
	static int n=1011;
	
//	Scanner sc;
	
	public Account(String aname, double bal) {
		this.aname = aname;
		this.bal = bal;
		this.accno = count++;
		this.pin=n++;
	}
	
	void checkBal()
	{
		System.out.println("your account bal:"+this.bal);
	}
	
	void withdraw(double amt)
	{
		if(amt<=this.bal)
		{
			this.bal=this.bal-amt;
			System.out.println("amount withdraw successfully");
			System.out.println("current balance:"+this.bal);
		}
		else
			System.out.println("Insufficient Funds");
	}
	
	void deposit(double amt)
	{
		if(amt>0)
		{
			this.bal=this.bal+amt;
			System.out.println("amount deposit successfully");
			System.out.println("current balance:"+this.bal);
		}
		else
			System.out.println("Invalid Amount");
	}
	
	void changePin(int oldpin,Scanner sc)
	{
		if(this.pin==oldpin)
		{
			System.out.println("enter the new pin");
			this.pin=sc.nextInt();
			System.out.println("pin changed successfully");
			System.out.println("your new pin:"+this.pin);
		}
		else
			System.out.println("Incorrect Pin");
	}
	
	public void display() {
		System.out.println("====your account details====");
		System.out.println("Account holder name:"+this.aname);
		System.out.println("Account Number:"+this.accno);
		System.out.println("Account Pin:"+this.pin);
		System.out.println("Account Balance:"+this.bal);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account ac=null;
		while(true)
		{
			System.out.println("Welcome to PentagonSpace Bank");
			System.out.println("Press 1:to create account");
			System.out.println("Press 2:to withdraw");
			System.out.println("Press 3:to deposit");
			System.out.println("Press 4:to check balance");
			System.out.println("Press 5:to change pin");
			System.out.println("Press 6:to exit");
			int input=sc.nextInt();
			
			switch (input) {
			case 2:
				System.out.println("enter the amount to withdraw");
				double amt=sc.nextDouble();
				ac.withdraw(amt);
				break;
			case 3:
				System.out.println("enter the amount to deposit");
				double damt=sc.nextDouble();
				ac.deposit(damt);
				break;
			case 4:
				ac.checkBal();
				break;
			case 5:
				System.out.println("enter the old pin");
				int pin=sc.nextInt();
				ac.changePin(pin,sc);
				break;
			case 6:
				System.out.println("Thank you visit again");
				System.exit(0);
				break;
			}
		}
	}

	
}
