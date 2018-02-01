import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Bank myBank = new Bank();
		Account account1 = new Account("1111", "checking", 500.00);
		Account account2 = new Account("2222", "savings", 2500.00);

		myBank.addAccount(account1);
		myBank.addAccount(account2);

		System.out.println("Here are your accounts with us: ");
		System.out.println(myBank.getAccount("1111").getInfo());
		System.out.println(myBank.getAccount("2222").getInfo());

		int response = 0;
		while (response != -1) {
			System.out.println("What would you like to do?");
			System.out.println("Type 1 for deposit");
			System.out.println("Type 2 for withdrawl");
			System.out.println("Type 3 for check balance");
			System.out.println("Type 4 to close account");
			System.out.println("Type -1 to finish");
			response = input.nextInt();
			input.nextLine();

			if (response == 1) {
				System.out.println("Here are your accounts with us: ");
				System.out.println(myBank.getAccount("1111").getInfo());
				System.out.println(myBank.getAccount("2222").getInfo());
				System.out.println("Which one would you like to make the deposit?");
				String accountChoice = input.nextLine();
				System.out.println("How much would you like to deposit?");
				double depositAmount = input.nextDouble();
				myBank.getAccount(accountChoice).deposit(depositAmount);

				System.out.println("The current balance in that account is now: "
						+ myBank.getAccount(accountChoice).checkBalance());
				input.nextLine();

			}

			if (response == 2) {
				System.out.println("Here are your accounts with us: ");
				System.out.println(myBank.getAccount("1111").getInfo());
				System.out.println(myBank.getAccount("2222").getInfo());
				System.out.println("Which one would you like to make a withdrawl?");
				String accountChoice = input.nextLine();
				System.out.println("How much would you like to withdraw?");
				double withdrawlAmount = input.nextDouble();
				myBank.getAccount(accountChoice).withdrawl(withdrawlAmount);

				System.out.println("The current balance in that account is now: "
						+ myBank.getAccount(accountChoice).checkBalance());
				input.nextLine();
			}
			
			if (response ==3) {
				System.out.println("Which account would you like to know the balance of?");
				String accountChoice = input.nextLine(); 
				System.out.println("The balance of that account is: " + myBank.getAccount(accountChoice).checkBalance());
				input.nextLine(); 
				
			}
			
			if(response==4) {
				System.out.println("Which account would you like to close?");
				String accountChoice = input.nextLine(); 
				myBank.closeAccount(accountChoice);
				
			}
			

		}

		System.out.println("Goodbye!");
		System.exit(0);

	}

}
