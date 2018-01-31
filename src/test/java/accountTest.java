import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class accountTest {
	@Test
	public void shouldInstantiateAnAccount() {
		Account underTest = new Account("",""); 
		assertNotNull(underTest); 
		
	}
	
	@Test
	public void shouldCheckForAccounts() {
		Account underTest = new Account("","");
		underTest.addAccount("1234","Billy Bob");
		int check = underTest.checkAccountList();
		assertEquals(1,check); 
	}
	
	@Test
	public void shouldReturnAccountName() {
		Account underTest = new Account("",""); 
		underTest.addAccount("1234", "Billy Bob");
		String checkName = underTest.getName("1234");
		assertEquals("Billy Bob", checkName);
		
	}
	
	@Test
	public void shouldReturnAccountNumber() {
		Account underTest = new Account("", "");
		underTest.addAccount("1234", "Billy Bob");
		String checkNum = underTest.getNum("Billy Bob");
		assertEquals("1234", checkNum); 
		
	}

}
