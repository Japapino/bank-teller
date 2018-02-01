import java.util.Scanner;

public class BankApp {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		Bank myBank = new Bank(); 
		Account account1 = new Account("1111","checking",500.00);
		Account account2 = new Account("2222","savings",2500.00);
		
		
		myBank.addAccount("1111", "me");
		myBank.addAccount("2222","me"); 
		
		
		System.out.println("Here are your accounts with us: ");
		System.out.println(account1.getAccountType()+ " " +account1.checkBalance());
		System.out.println(account2.getAccountType() + " " +account2.checkBalance());
		
	
	}

}
