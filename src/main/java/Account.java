import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Account {
	private String accountNum;
	private String type;
	private double balance;
	// Map<String,String> accounts = new HashMap<String, String>();

	public Account(String accountNum, String type, double balance) {
		this.accountNum = accountNum;
		this.type = type;
		this.balance = balance;
	}

	public double checkBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}

	public void withdrawl(double withdrawl) {
		balance -= withdrawl;
	}

	public String getAccountNumber() {
		return accountNum;
	}
	
	public String getAccountType() {
		return type;
	}

}
