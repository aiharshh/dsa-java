package OOPS1;
class Account{
	//Data Security
	private double balance;
	// We can't access the above balance directly so We are writing this method
	// But we can access this indirectly so for that we are writing a method
	// methods :: public 
	public double getBalance(double balance) {
		boolean result = validate("sachin","sachin123");
		if(result==true) {
			this.balance= this.balance -  balance;		
			System.out.println("Withdrawing :: "+balance+" Amount");
			return balance;
		}
		else {
			//Throw a meaningful message to the User
			System.out.println("Invalid Username/Password, Try Again...!");
			return 0.0f;
		}
		//withdrawing the money
//		return 0.0f;
	}
	//methods :: public
	public void setBalance(double balance) {
		//perform authentication
		boolean result = validate("sachin","sachin123");
		//depositing the money
		if(result == true) {
			//deposite money
			this.balance = this.balance + balance;
			System.out.println("Credited to the Account!");
		}
		else {
			//Throw a meaningful message to the User
			System.out.println("Invalid Username/Password, Try Again...!");
		}
		return;
	}
	private boolean validate(String userName, String password) {
		//logic for authentication
		return userName.equalsIgnoreCase("sachin") && password.equals("sachin123");
	}
}
public class TestApp {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setBalance(1000.0);
		acc.getBalance(500.0);
	}
}