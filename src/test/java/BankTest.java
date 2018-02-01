import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
		underTest.addAccount("1234","bob");
		assertNotNull(underTest); 		
	}
	
	@Test
	public void assertTwoAccountsHaveBeenAdded() {
		Bank underTest = new Bank();
		underTest.addAccount("1234","bill");
		underTest.addAccount("3456","bob");
		int check = underTest.numAccounts(); 
		assertEquals(2,check); 
	}
	
	@Test
	public void shouldReturnAccountNumber() {
		Bank underTest = new Bank();
		underTest.addAccount("1234","bill");
		String check = underTest.getAccountNum("bill");
		assertEquals("1234", check);		
	}
	
	@Test 
	public void shouldRemoveAccount() {
		Bank underTest = new Bank(); 
		underTest.addAccount("1234","bill");
		underTest.closeAccount("bill"); 
		int check = underTest.numAccounts(); 
		assertEquals(0, check); 
		
		
	}

}
