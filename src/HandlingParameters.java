import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)// first steps
public class HandlingParameters {

	String userName;
	String password;
	
	public void HandlingParameters(String user, String pwd)
	{
		userName=user;
		password=pwd;
	}
	
	
	@Test
	public void Login()
	{
		System.out.println(userName+"----"+password);
	}
	
	@Parameters
	
	public static Collection<String []> getData(){
		
		String data[][]=new String [2][2];
		data[0][0]="Google";
		data[0][1]="Google@123";
		data[1][0]="Yahoo";
		data[1][1]="Yahoo123";
		
		return Arrays.asList(data);
		
	}
}
