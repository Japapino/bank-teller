import org.junit.Test;

public class accountTest {
	@Test
	public void shouldInstantiateAnAccount() {
		Account underTest = new Account("",""); 
		assertNotNull(underTest); 
		
	}

}
