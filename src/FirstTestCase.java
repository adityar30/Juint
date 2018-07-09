import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class FirstTestCase {
	
	@BeforeClass
	public static void OpenBrowser()
	{
		System.out.println("Open Browser");
	}
	
	
	@Before
	public void OpenURL()
	{
		System.out.println("Open Gmail");	
	}
	
	@Test
	
	public void getLoginVerified()
	{	
		
		System.out.println("Login");
		
	}
	
	//@Ignore
	@Test
	
	public void VerifyRegistrationSuccess()
	{
		
		System.out.println("Open Gmail");
		
		System.out.println("Register Details");
		
		System.out.println("Click on Save and Close Gmail");
		
		String one="Adi";
		String two="Adi";
		Assert.assertEquals(one,two);
		Assert.assertTrue(5>2);
		Assert.assertFalse(2>4);	
		Assert.fail();
	}
	
	@After
	
	public void CloseGmail()
	{
		System.out.println("Close Gmail");
	}
	 
	@AfterClass
	public static void CloseBrowser()
	{
		System.out.println("Close Browser");
	}
	
	@Test
	public void Registration()
	{
		System.out.println("First");
		String actual = "Google";
		String expected ="Google1";
		
		Assert.assertEquals(expected, actual);
		System.out.println("Second");
	}

}
