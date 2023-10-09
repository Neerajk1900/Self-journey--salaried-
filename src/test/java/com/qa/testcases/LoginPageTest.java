package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.Cifselectionpage;
import com.qa.pages.LoginPage;
import com.qa.util.Base;
import com.qa.util.JiraPolicy;
import com.qa.utils.Utilities;

public class LoginPageTest extends  Base {

	LoginPage loginpage;
	Cifselectionpage cifselectionpage;
	public WebDriver driver;

	public LoginPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setup() 
	{
		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));		
		loginpage = new LoginPage();
	}

	@AfterMethod
	public void tearDown() 
	{
		driver.quit();	
	}


	@JiraPolicy(logTicketReady=false)
	@Test(priority=-10, enabled=true)

	public void validateLoginPageUrlTest(){
		
		String Url = loginpage.validateLoginPageUrl();
		//url:- https://cconboarduat.aubankuat.in/auccself/#/landing
		Assert.assertEquals(Url, "https://cconboarduat.aubankuat.in/auccself/#/landing");
	}
	
	@JiraPolicy(logTicketReady=true)	
	@Test(priority=-9, enabled=true)
	public void validateLoginPageTitleTest(){

		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Credit Card Online | AU Small Finance Bank");
	}


	@JiraPolicy(logTicketReady=true)	
	@Test(priority=-8, enabled=true)

	public void mobileFieldDisplayedTest()
	{
		Assert.assertTrue(loginpage.mobileFieldDisplayed(),"Mobile Number field is displayed on the Login screen");
	}

	@JiraPolicy(logTicketReady=true)	
	@Test(priority=-7, enabled=true)

	public void mobileFieldEnabledTest()
	{
		Assert.assertTrue(loginpage.mobileFieldEnabled(),"Mobile Number field is Enabled on the Login screen");
	}

	@JiraPolicy(logTicketReady=true)	
	@Test(priority=-6, enabled=true)

	public void MobileNumberValidationTest()
	{
		loginpage.MobileNumberValidation();
	}

	@JiraPolicy(logTicketReady=true)	
	@Test(priority=-5, enabled=true)

	public void mobileBlankFieldValidationTest()
	{
		loginpage.mobileBlankFieldValidation();
	}


	@JiraPolicy(logTicketReady=true)	
	@Test(priority=-4, enabled=true)

	public void CheckboxDisplayedTest()
	{
		Assert.assertTrue(loginpage.CheckboxDisplayed(),"Checkbox is displayed on the Login screen");
	}


	@JiraPolicy(logTicketReady=true)	
	@Test(priority=-3, enabled=true)

	public void validatecheckboxTest() throws Exception
	{
		loginpage.validatecheckbox();
	}


	@JiraPolicy(logTicketReady=true)	
	@Test(priority=-2, enabled=true)

	public void validateOTPbuttonClickableTest() throws Exception
	{
		Assert.assertTrue(loginpage.validateOTPbuttonClickable(),"OTP field is Enabled/clickable on the Login screen");
	}

	

	@JiraPolicy(logTicketReady=true)
	@Test(priority=-1, enabled=true)
	public void OTPVerificationTimerTest() throws InterruptedException{

		loginpage.OTPVerificationTimer();	
	}


	@JiraPolicy(logTicketReady=true)	
	@Test(priority=1, enabled=true)

	public void panFieldDisplayedTest() throws Throwable
	{
		Assert.assertTrue(loginpage.panFieldDisplayed(),"Pan field is displayed");
	}

	@JiraPolicy(logTicketReady=true)	
	@Test(priority=2, enabled=true)

	public void panFieldClickableTest() throws Exception
	{
		Assert.assertTrue(loginpage.panFieldClickable(),"PAN field is Enabled ");
	}

	@JiraPolicy(logTicketReady=true)	
	@Test(priority=3, enabled=true)

	public void panNumberValidationTest() throws Throwable
	{
		loginpage.panNumberValidation();
	}
	
	@JiraPolicy(logTicketReady=true)	
	@Test(priority=4, enabled=true)

	public void ProceedbuttonEnableTest() throws InterruptedException
	{
		Assert.assertTrue(loginpage.ProceedbuttonEnable(),"Proceed button is Enabled");
	}

	@JiraPolicy(logTicketReady=true)	
	@Test(priority=5, enabled=true)

	public void NSDLValidationTest() throws InterruptedException
	{
		loginpage.NSDLValidation();
	}

	@JiraPolicy(logTicketReady=true)	
	@Test(priority=6, enabled=true)
	public void loginTest() throws Exception{

		loginpage = new LoginPage();

		/*WebElement username1 =driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		boolean s = username1.isDisplayed();
		System.out.println("Mobile no accept 10 digit:"+s); */

		cifselectionpage=loginpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));				
	}

	@DataProvider(name = "excelData")
	public Object[][] supplyTestData() {

		Object[][] data =  Utilities.getTestDataFromExcel("Login");
		return data;
	}


}



