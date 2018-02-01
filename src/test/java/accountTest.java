import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class accountTest {
	@Test
	public void shouldInstantiateAnAccount() {
		Account underTest = new Account("","",0); 
		assertNotNull(underTest); 
	}
	
	@Test
	public void shouldHaveABalanceOf100() {
		Account underTest = new Account("","",100);
		double check = underTest.checkBalance(); 
		assertEquals(100,check,0.0001); 
		
	}
	
	@Test
	public void shouldAdd50() {
		Account underTest = new Account("","",100);
		underTest.deposit(50.01);
		double check = underTest.checkBalance(); 
		assertEquals(150.01,check,0.0001); 
	}
	
	@Test
	public void shouldSubtract50() {
		Account underTest = new Account("","",100);
		underTest.withdrawl(50.01);
		double check = underTest.checkBalance(); 
		assertEquals(49.99,check,0.0001); 
	}
	
//	@Test
//	public void shouldGiveName() {
//		Account underTest = new Account("1234","Bob",0);
//		String check = underTest.getName("1234");
//		assertEquals("Bob", check); 
//	}
//	
//	@Test
//	public void shouldGiveNaumber() {
//		Account underTest = new Account("1234","Bob",0);
//		String check = underTest.getNum("Bob");
//		assertEquals("1234", check); 
//	}
}
