import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

	@Test
	public void shouldInstantiateAnAccoutListObject() {
		Bank underTest = new Bank();
		assertNotNull(underTest); 
		
	}
	
	@Test
	public void assertThatAnAccountHasBeenAdded() {
		Bank underTest = new Bank();
		Account account1 = new Account("1111", "checking", 500.00);
		underTest.addAccount("1111", account1);
		assertNotNull(underTest); 		
	}
	
	@Test
	public void assertTwoAccountsHaveBeenAdded() {
		Bank underTest = new Bank();
		Account account1 = new Account("1111", "checking", 500.00);
		Account account2 = new Account("1111", "checking", 500.00);
		underTest.addAccount("1111", account1);
		underTest.addAccount("2222", account2);
		int check = underTest.numAccounts(); 
		assertEquals(2,check); 
	}
	
	@Test
	public void shouldReturnAccountBalance() {
		Bank underTest = new Bank();
		Account account1 = new Account("1111", "", 500.00);
		underTest.addAccount("1111", account1);
		double check = underTest.getAccount("1111").checkBalance();
		Assert.assertEquals(500.00,check,0.001);	
	}
	
	@Test 
	public void shouldRemoveAccount() {
		Bank underTest = new Bank(); 
		Account account1 = new Account("1111", "checking", 500.00);
		underTest.addAccount("1234",account1);
		underTest.closeAccount("1234"); 
		int check = underTest.numAccounts(); 
		assertEquals(0, check); 
		
		
	}

}
