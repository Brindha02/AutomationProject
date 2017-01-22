package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import wrappers.GenericWrappersMethods;

public class DeleteComputer extends GenericWrappersMethods {
	@BeforeMethod(groups="common")
	public void loginwrapper()
	{
		invokeApp("chrome","http://computer-database.herokuapp.com");
		
	}
	@Test(groups={"smoke","regression"},dataProvider="TestDataDeleteComputer",dataProviderClass=data.TestDataProgram.class)
	public void deleteComputer(String computer_name) throws Exception{
		
		enterById("searchbox",computer_name);
		clickById("searchsubmit");
		clickByXpath("(//a[@id='add']/following::a )[5]");
		Thread.sleep(3000);
	    clickByXpath("//input[@value='Delete this computer']");
	    verifyTextByXpath("//div[@class='alert-message warning']","Done! Computer has been deleted" );
	  	}	
	@AfterMethod(groups="common")
	public void closeBrowser()
	{
		quitBrowser();
	}
}
