package com.qa.testcases;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.Communicationscreenpage;
import com.qa.pages.LoginPage;
import com.qa.pages.Cifselectionpage;
import com.qa.util.JiraPolicy;
import com.qa.util.Base;

public class CifSelectionPageTest extends  Base{
   
    public WebDriver driver;
	LoginPage loginpage;
	Cifselectionpage cifselectionpage;
    Communicationscreenpage communicationscreen;
    
    public CifSelectionPageTest()
    {
        super();
    }
    
    @BeforeMethod
    public void setup() 
    {    
    driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
	loginpage = new LoginPage();
    cifselectionpage = new Cifselectionpage();
    }
    
    @AfterMethod
	public void tearDown() 
	{
		driver.quit();	
	}

	@JiraPolicy(logTicketReady=true)
    @Test(priority=1, enabled=true)
    public void loginTest() throws Exception{
        
    	loginpage = new LoginPage();
    	cifselectionpage=loginpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));
    }
    
	@JiraPolicy(logTicketReady=true)	
	@Test(priority=2, enabled=true)
	public void validateCifSelectionPageUrlTest() throws Exception{
		loginpage = new LoginPage();
    	cifselectionpage=loginpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));
    	cifselectionpage = new Cifselectionpage();

		String url = cifselectionpage.validateCifSelectionPageUrl();
		Assert.assertEquals(url, "https://cconboarduat.aubankuat.in/auccself/#/cifSelection");
	}

	@JiraPolicy(logTicketReady=true)	
	@Test(priority=3, enabled=true)
	public void EmpTypeFieldDisplayedTest() throws Exception

	{
		loginpage = new LoginPage();
    	cifselectionpage=loginpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));
    	cifselectionpage = new Cifselectionpage();
		
		Assert.assertTrue(cifselectionpage.EmpTypeFieldDisplayed(),"Emp type field is not displayed on the Cifselection screen");
	}
	

	@JiraPolicy(logTicketReady=true)	
	@Test(priority=4, enabled=true)
	public void validateEmpDropdownTest() throws Throwable
	{
		loginpage = new LoginPage();
    	cifselectionpage=loginpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));
    	cifselectionpage = new Cifselectionpage();
		Assert.assertTrue(cifselectionpage.validateEmpDropdown(),"Emp type dropdown is not clickable on the Cifselection screen");
	}
	
	@JiraPolicy(logTicketReady=true)	
	@Test(priority=5, enabled=true)
	public void SelectEmptypeSalariedTest() throws Exception
	{
		loginpage = new LoginPage();
    	cifselectionpage=loginpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));
    	cifselectionpage = new Cifselectionpage();
		cifselectionpage.SelectEmptypeSalaried();
	}
	
	@JiraPolicy(logTicketReady=true)	
	@Test(priority=6, enabled=true)
	public void cifSelectionDisplayedTest() throws Throwable
	{
		loginpage = new LoginPage();
    	cifselectionpage=loginpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));
    	cifselectionpage = new Cifselectionpage();
		Assert.assertTrue(cifselectionpage.cifSelectionDisplayed(),"cif address is not displayed on the Cifselection screen");
	}
	
	@JiraPolicy(logTicketReady=true)	
	@Test(priority=7, enabled=true)
	public void validateNextbtnClickableTest() throws Exception
	{
		loginpage = new LoginPage();
    	cifselectionpage=loginpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));
    	cifselectionpage = new Cifselectionpage();
		Assert.assertTrue(cifselectionpage.validateNextbtnClickable(),"Next Button is not Enable on the Cifselection screen");
	}

	
	@JiraPolicy(logTicketReady=true)
    @Test(priority=8, enabled=true)
    public void cifTest() throws Throwable
     {  
		loginpage = new LoginPage();
    	cifselectionpage=loginpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));
    	cifselectionpage = new Cifselectionpage();
        communicationscreen= cifselectionpage.cifpage(); 
        
     }
	
  
   /* @AfterClass
    public void tearDown() 
    {    
        driver.quit();       
    }*/

}