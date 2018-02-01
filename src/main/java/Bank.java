import java.util.HashMap;
import java.util.Map;

public class Bank {
	private String accountNum;
	private Map<String, Account> accountList = new HashMap<String, Account>();

	public void accountList() {

	}

	public void addAccount(String num, Account account) {

		accountList.put(num, account);
		//accountList.put(account.getAccountNumber(), account);
		
	}

	public int numAccounts() {
		return accountList.size();

	}

	public Account getAccount(String accountNum) {
		// TODO Auto-generated method stub
		return accountList.get(accountNum);
	}

	public void closeAccount(String accountName) {
		// TODO Auto-generated method stub
		accountList.remove(accountName);
	}

}
