package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.Communicationscreenpage;
import com.qa.pages.LoginPage;
import com.qa.pages.Cifselectionpage;
import com.qa.pages.Personaldetailpage;
import com.qa.util.JiraPolicy;
import com.qa.util.Base;

public class CommunicationScreenPageTest extends  Base{

	public WebDriver driver;
	LoginPage loginpage;
	Cifselectionpage cifselectionpage;
	Communicationscreenpage communicationscreen;
	Personaldetailpage personaldetails;
	//N_officeaddressdetailsPage officeaddress;

	public CommunicationScreenPageTest()
	{
		super();
	}

	@BeforeClass
	public void setup() 
	{      
		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
	}

	@JiraPolicy(logTicketReady=true)
	@Test(priority=-1, enabled=true)
	public void loginTest() throws Exception
	{       
		loginpage = new LoginPage();
		cifselectionpage=loginpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));      
	}

	@JiraPolicy(logTicketReady=true)
	@Test(priority=1, enabled=true)
	public void cifTest() throws Throwable
	{ 
		cifselectionpage = new Cifselectionpage();
		communicationscreen = cifselectionpage.cifpage();       
	}

	@JiraPolicy(logTicketReady=true)	
	@Test(priority=2, enabled=true)
	public void ValidatecommunicationpageURLTest() throws Exception{

		communicationscreen = new Communicationscreenpage();
		String url = communicationscreen.ValidatecommunicationpageURL();
		Assert.assertEquals(url, "https://cconboarduat.aubankuat.in/auccself/#/details/communicationAddress");
	}

	@JiraPolicy(logTicketReady=true)
	@Test(priority=3, enabled=true)	
	public void Cifddressbtn() throws InterruptedException{
		communicationscreen = new Communicationscreenpage();
		WebElement comaddress = driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]"));    
		Assert.assertTrue(comaddress.isEnabled(), "Cif. Address is Displayed");
	}

	@JiraPolicy(logTicketReady=true)
	@Test(priority=4, enabled=true)
	public void ComTest() throws Exception
	{
		communicationscreen = new Communicationscreenpage();
		personaldetails= communicationscreen.communication("Near AU Bank" ,"Gurgaon , Haryana","Sector 46, Haryana","122003");
	}

	@JiraPolicy(logTicketReady=true)
	@Test(priority=5, enabled=true)
	public void currentddressbtn() throws InterruptedException
	{
	communicationscreen = new Communicationscreenpage();
	WebElement curaddress = driver.findElement(By.xpath("(//div[@class='mat-radio-inner-circle'])[2]"));
    Assert.assertTrue(curaddress.isSelected(), "Current Address is selected");
	}

	@JiraPolicy(logTicketReady=true)
	@Test(priority=6, enabled=true)
	public void enterlandmark() throws InterruptedException{
		communicationscreen = new Communicationscreenpage();
		WebElement Landmark = driver.findElement(By.xpath("//input[@formcontrolname='cLandmark']"));
		Assert.assertTrue(Landmark.isEnabled(), "Landmark is enabled: Enter Landmark ");
	}

	@JiraPolicy(logTicketReady=true)
	@Test(priority=7, enabled=true)
	public void Commaddress1() throws InterruptedException
	{
		WebElement Commadd1 = driver.findElement(By.xpath("//input[@formcontrolname='caddress1']"));
		Assert.assertTrue(Commadd1.isDisplayed(), "Enter Communication address1 ");
	}


	@JiraPolicy(logTicketReady=true)
	@Test(priority=8, enabled=true)
	public void Commaddress2() throws InterruptedException
	{
		WebElement Commadd2 = driver.findElement(By.xpath("//input[@formcontrolname='caddress2']"));
		Assert.assertTrue(Commadd2.isDisplayed(), "Enter Communication address2 ");
	}

	@JiraPolicy(logTicketReady=true)
	@Test(priority=9, enabled=true)

	public void enterpincode() throws InterruptedException
	{
		WebElement pincode = driver.findElement(By.xpath("//input[@formcontrolname='cpin']"));
		Assert.assertTrue(pincode.isEnabled(), "Enter Communication Pincode ");
		System.out.println("State is autofetched from pincode");
	}


	@JiraPolicy(logTicketReady=true)
	@Test(priority=10, enabled=true)
	public void clicknext() throws InterruptedException
	{
		WebElement nextbtn = driver.findElement(By.xpath("//button[text()=' Next ']"));
		Assert.assertTrue(nextbtn.isEnabled(), "click on Next button : Navigate on Personal Details screen");
	}


	@AfterClass
	public void tearDown() 
	{

		driver.quit();

	}

}