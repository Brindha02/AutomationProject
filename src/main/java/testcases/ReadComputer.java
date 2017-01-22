package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import wrappers.GenericWrappersMethods;

public class ReadComputer extends GenericWrappersMethods  {
	@BeforeMethod(groups="common")
	public void loginwrapper()
	{
		invokeApp("chrome","http://computer-database.herokuapp.com");
		
	}
	@Test(groups="regression",dataProvider="TestDataReadComputer",dataProviderClass=data.TestDataProgram.class)
	public void readComputer(String computer_name) throws Exception{
		
		enterById("searchbox",computer_name);
		clickById("searchsubmit");
		clickByXpath("(//a[@id='add']/following::a )[5]");
	}
	
	@AfterMethod(groups="common")
	public void closeBrowser()
	{
		quitBrowser();
	}

}
