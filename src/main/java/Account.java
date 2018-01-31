import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Account {
	String accountNum;
	String name; 
	Map<String,String> accounts = new HashMap<String, String>(); 
	
	
	public Account(String accountNum, String name) {
		this.accountNum = accountNum;
		this.name = name;
	}
	
	public int checkAccountList() {
		return accounts.size(); 
	}
	
	public void addAccount(String accountNum, String accountName) {
		this.accountNum = accountNum; 
		this.name = accountName; 
		accounts.put(accountNum, accountName); 
	}
	
	public String getName(String accountNum) {
		return accounts.get(accountNum); 
	}
	
	public String getNum(String accountName) {
		return accounts.get(accountName); 
	}
	
	

}
