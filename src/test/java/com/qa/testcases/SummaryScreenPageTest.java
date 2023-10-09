package com.qa.testcases;





import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.pages.Communicationscreenpage;
import com.qa.pages.DocumentuploadPage;
import com.qa.pages.EmployeedetailsPage;
import com.qa.pages.LoginPage;
import com.qa.pages.Cifselectionpage;
import com.qa.pages.OfficeaddressdetailsPage;
import com.qa.pages.Personaldetailpage;
import com.qa.pages.Summaryscreenpage;
import com.qa.util.JiraPolicy;
import com.qa.util.Base;
import com.qa.utils.Utilities;

import net.bytebuddy.implementation.Implementation.Context.ExtractableView;

/*public class SummaryScreenPageTest extends Base{
   
	public WebDriver driver;
	LoginPage loginpage;
	Cifselectionpage cifselectionpage;
    Communicationscreenpage communicationscreen;
    OfficeaddressdetailsPage officeaddress;
    Personaldetailpage personaldetails;
    EmployeedetailsPage employeedetailsPage;
    Summaryscreenpage summaryscreenpage;
    DocumentuploadPage uploaddocument;

    
    public SummaryScreenPageTest()
    {
        super();
    }
    
    @BeforeClass
    public void setup() 
    {
        
    driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
 
    }
    
    @JiraPolicy(logTicketReady=true)
    @Test(priority=1, enabled=true)
    public void urlTest() throws InterruptedException{
        
        loginpage = new LoginPage();
        
        String Actualurl=driver.getCurrentUrl();
		Assert.assertEquals(Actualurl, "https://cconboarduat.aubankuat.in/auccself/#/landing");  
	   System.out.println("URL is working");        
    }
    
    @JiraPolicy(logTicketReady=true)
  	@Test(priority=2, enabled=true)
  	
         public void validateLoginPageTitle(){
        loginpage = new LoginPage();
  		String title = loginpage.validateLoginpagetitle();
  		Assert.assertEquals(title, "Credit Card Online | AU Small Finance Bank");
      }
    @JiraPolicy(logTicketReady=true)
   	@Test(priority=3, enabled=true)
   	
          public void validateMobilenofield() throws InterruptedException{
    	loginpage=loginpage.validateMobilenofield(prop.getProperty("mobile"));
    	boolean b1=driver.findElement(By.xpath("//input[@placeholder='Enter 10 digit mobile number']")).isEnabled();
		System.out.println("Mobile no accept 10 digit");
       } 
    
    @Test(priority=1, enabled=true)
    public void loginTest() throws Exception
       {       
        loginpage = new LoginPage();
        cifselectionpage=loginpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));      
       }
    
    @JiraPolicy(logTicketReady=false)
    
    @Test(priority=2, enabled=true)
    public void cifTest() throws Throwable
    {   
    	cifselectionpage = new Cifselectionpage();
        communicationscreen= cifselectionpage.cifpage();       
    }
    
   @JiraPolicy(logTicketReady=false)
    
   @Test(priority=3, enabled=true)
   public void ComTest() throws Exception
   {
  	   communicationscreen = new Communicationscreenpage();
       personaldetails= communicationscreen.communication("Near AU Bank" ,"Gurgaon , Haryana","Sector 46, Haryana","122003");
	
   }
   
   @JiraPolicy(logTicketReady=false)
   
   @Test(priority=4, enabled=true)
   public void AddTest() throws Exception
   {
	   personaldetails = new Personaldetailpage();
	   employeedetailsPage= personaldetails.Personaldetails("Kunj");
	
   }
   
    
   @Test(priority=5, enabled=true)
   public void EmpTest() throws InterruptedException
   {
	   employeedetailsPage = new EmployeedetailsPage();   
	   //summaryscreenpage = employeedetailsPage.employeedetail(prop.getProperty("Designation"),prop.getProperty("Monthlysalary"),"Decimal");
	
   }
    @JiraPolicy(logTicketReady=true)
   @Test(priority=6, enabled=true)
   public void summary() throws Exception
   {
 	   summaryscreenpage =new Summaryscreenpage();   
 	   uploaddocument= summaryscreenpage.summary();
   }   
   
    @AfterClass
    public void tearDown() 
    {
        
        driver.quit();
        
    } */
    
    
    
    //Extra test case for cifpage
    
   /* @JiraPolicy(logTicketReady=true)
    @Test(priority=9, enabled=true)
   	
    public void clickonsalarydropdown() throws InterruptedException{
    WebElement salarydd = driver.findElement(By.xpath("//mat-select[contains(@formcontrolname,'empType')]"));
        
    Assert.assertTrue(salarydd.isEnabled(), "User can select Salaried as employment type");
    }
    
    @JiraPolicy(logTicketReady=true)
    @Test(priority=10, enabled=true)
   	
    public void Selectemploymenttype() throws InterruptedException{
    WebElement emptype = driver.findElement(By.xpath("//span[normalize-space()='Salaried']"));
    Assert.assertTrue(emptype.isSelected(), "Employment Type : Salaried Selected");
    }
    
    @JiraPolicy(logTicketReady=true)
    @Test(priority=11, enabled=true)
   	
    public void Selecteaddress() throws InterruptedException{
    WebElement empaddress = driver.findElement(By.xpath("//div[@class='mat-radio-label-content']"));
    Assert.assertTrue(empaddress.isSelected(), "User is address is selected");
    }
    
    @JiraPolicy(logTicketReady=true)
    @Test(priority=12, enabled=true)
   	
    public void clickonnext() throws InterruptedException{
    WebElement nextbutton = driver.findElement(By.xpath("//button[text()=' Next ']"));
    Assert.assertTrue(nextbutton.isEnabled(), "click on Next button : Navigate on Communication screen");
    }
 

} */