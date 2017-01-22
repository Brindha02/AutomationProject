package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import wrappers.GenericWrappersMethods;

public class EditComputer extends GenericWrappersMethods {

	@BeforeMethod(groups="common")
	public void loginwrapper()
	{
		invokeApp("chrome","http://computer-database.herokuapp.com");
		
	}
	@Test(groups="regression",dataProvider="TestDataEditComputer",dataProviderClass=data.TestDataProgram.class)
	public void editComputer(String computer_name,String computer_name1,String introduced_date,String discontinued_date,String company_name) throws Exception{
		
		enterById("searchbox",computer_name);
		clickById("searchsubmit");
		clickByXpath("(//a[@id='add']/following::a )[5]");
		enterById("name",computer_name1);
		enterById("introduced",introduced_date);
		enterById("discontinued",discontinued_date);
		selectVisibileTextById("company",company_name);
		Thread.sleep(3000);
		clickByXpath("//input[@value='Save this computer']");
		
	}
	
	@AfterMethod(groups="common")
	public void closeBrowser()
	{
		quitBrowser();
	}

	
	
}
