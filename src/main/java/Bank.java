import java.util.HashMap;
import java.util.Map;

public class Bank {
	private String accountNum;
	private String accountName;
	private Map<String, String> accountList = new HashMap<String, String>();

	public void accountList() {

	}

	public void addAccount(String num, String name) {
		// TODO Auto-generated method stub
		accountList.put(num, name);
	}

	public int numAccounts() {
		return accountList.size();

	}

	public String getAccountNum(String accountName) {
		// TODO Auto-generated method stub
		return accountList.get(accountName);
	}

	public void closeAccount(String accountName) {
		// TODO Auto-generated method stub
		accountList.remove(accountName);
	}

}
