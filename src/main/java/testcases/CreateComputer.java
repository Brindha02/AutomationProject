package testcases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import wrappers.GenericWrappersMethods;

public class CreateComputer extends GenericWrappersMethods {
		
	@BeforeMethod(groups="common")
	public void loginwrapper()
	{
		invokeApp("chrome","http://computer-database.herokuapp.com");
		
	}
	@Test(groups="regression",dataProvider="TestDataCreateComputer",dataProviderClass=data.TestDataProgram.class)
	public void createComputer(String computer_name,String introduced_date,String discontinued_date,String company_name) throws Exception{
		
		clickById("add");
		enterById("name",computer_name);
		enterById("introduced",introduced_date);
		enterById("discontinued",discontinued_date);
		selectVisibileTextById("company",company_name);
		Thread.sleep(3000);
		clickByXpath("//input[@value='Create this computer']");
	}
	
	@AfterMethod(groups="common")
	public void closeBrowser()
	{
		quitBrowser();
	}

	



}
