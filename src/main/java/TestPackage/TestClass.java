package TestPackage;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void LoginCheck() {
			System.out.println("This is for testimg Login Page");
			assertEquals("Abc", "pqr", "My message................");
		}
	
}


