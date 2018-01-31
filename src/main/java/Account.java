import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Account {
	private String accountNum;
	private String name; 
	private double balance; 
	Map<String,String> accounts = new HashMap<String, String>(); 
	
	public Account(String accountNum, String name, double balance) {
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance; 
	}
	
	public double checkBalance() {
		return balance; 
	}
	
	public int checkAccountList() {
		return accounts.size(); 
	}
	
	public void deposit(double deposit) {
		balance+=deposit; 
	}
	
	public void withdrawl(double withdrawl) {
		balance-=withdrawl;
	}


}
