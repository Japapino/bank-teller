import java.util.Scanner;

public class BankApp {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		Bank myBank = new Bank(); 
		Account account1 = new Account("1234","checking",500.00);
		Account account2 = new Account("2222","savings",2500.00);
	}

}
