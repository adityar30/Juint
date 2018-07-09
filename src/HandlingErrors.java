import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class HandlingErrors {

	@Rule
	public ErrorCollector er =new ErrorCollector();
	
	
	
	@Test (timeout=1000)
	
	public void verifyLogin()
	{
		String expected ="Login";
		String actual ="Logout";
		
		try {
			
			Assert.assertEquals(expected,actual);
			
			
		}catch (Throwable t)
		{
			er.addError(t);
			
		}
		
		System.out.println("2nd Test Case");
	}
	
	
}
