package com.qa.testcases;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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

public class EmployeeDetailsPageTest extends  Base{
   
	public WebDriver driver;
	LoginPage loginpage;
	Cifselectionpage cifselectionpage;
    Communicationscreenpage communicationscreen;
    OfficeaddressdetailsPage officeaddress;
    Personaldetailpage personaldetails;
    EmployeedetailsPage employeedetailsPage;
    Summaryscreenpage summaryscreenpage;
    DocumentuploadPage uploaddocument;

    public EmployeeDetailsPageTest()
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
    public void loginTest() throws Exception
       {       
        loginpage = new LoginPage();
        cifselectionpage=loginpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));      
       }
    
	@JiraPolicy(logTicketReady=true)
    
    @Test(priority=2, enabled=true)
    public void cifTest() throws Throwable
    {  
    	cifselectionpage = new Cifselectionpage();
        communicationscreen= cifselectionpage.cifpage();       
    }
    
	@JiraPolicy(logTicketReady=true)
    
   @Test(priority=3, enabled=true)
   public void ComTest() throws Exception
   {
  	   communicationscreen = new Communicationscreenpage();
	   personaldetails= communicationscreen.communication("Near AU Bank" ,"Gurgaon , Haryana","Sector 46, Haryana","122003");

	
   }
   
	@JiraPolicy(logTicketReady=true)
   
   @Test(priority=4, enabled=true)
   public void AddTest() throws Exception
   {
	   personaldetails = new Personaldetailpage();
	   employeedetailsPage= personaldetails.Personaldetails("Kunj");
	
   }
  /*  
   @Test(priority=5, enabled=true)
   public void EmpTest() throws InterruptedException
   {
	   employeedetailsPage = new N_EmployeedetailsPage();   
	   summaryscreenpage = employeedetailsPage.employeedetail(prop.getProperty("Designation"),prop.getProperty("Monthlysalary"),"Decimal");
	
   } */
  
	@JiraPolicy(logTicketReady=true)

  @Test(priority=5, enabled=true)
   public void EmpTest() throws InterruptedException
   {
	   employeedetailsPage = new EmployeedetailsPage();   
	   uploaddocument = employeedetailsPage.employeedetail(prop.getProperty("Designation"),prop.getProperty("Monthlysalary"),"Decimal");
   } 
	
	@JiraPolicy(logTicketReady=true)
    @Test(priority=6, enabled=true)
   	
    public void Entercompanyname() throws InterruptedException{
    WebElement Companyname = driver.findElement(By.xpath("//input[@formcontrolname='companyName']"));     
    Assert.assertTrue(Companyname.isDisplayed(), "Enter Company Name : Related autosuggestion is displayed");
    }
	
	@JiraPolicy(logTicketReady=true)
    @Test(priority=7, enabled=true)
   	
    public void Selectcompanyname() throws InterruptedException{
    WebElement selectCompany = driver.findElement(By.xpath("(//mat-option[@role='option'])[2]"));    
    Assert.assertTrue(selectCompany.isSelected(), "Company Name : Selected");
    }
	
	@JiraPolicy(logTicketReady=true)
    @Test(priority=8, enabled=true)
   	
    public void Enterdesignation() throws InterruptedException{
    WebElement Designation = driver.findElement(By.xpath("//input[@formcontrolname='designation']"));     
    Assert.assertTrue(Designation.isEnabled(), "Enter Designation");
    }
	
	@JiraPolicy(logTicketReady=true)
    @Test(priority=9, enabled=true)
   	
    public void Entermonthlysalary() throws InterruptedException{
    WebElement Monthlysal = driver.findElement(By.xpath("//input[@formcontrolname='monthlySalary']"));     
    Assert.assertTrue(Monthlysal.isEnabled(), "Enter Monthly Salary");
    }
   
	@JiraPolicy(logTicketReady=true)
    @Test(priority=10, enabled=true)  	
    public void Checktermcondition() throws InterruptedException{
    WebElement Checkbox = driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']"));     
    Assert.assertTrue(Checkbox.isSelected(), "Checkbox is Selected : Term and Condition");
	System.out.println("All mandatory Details are filled");

    }
	
	@JiraPolicy(logTicketReady=true)
    @Test(priority=11, enabled=true)  	
    public void clickbtnfilled() throws InterruptedException{
    WebElement btnfilled= driver.findElement(By.cssSelector("button.btn-filled"));     
    Assert.assertTrue(btnfilled.isEnabled(), "Button is enabled");
    }
	
	@JiraPolicy(logTicketReady=true)
    @Test(priority=12, enabled=true)  	
    public void clickonnext() throws InterruptedException{
    WebElement Nextbtn= driver.findElement(By.xpath("//button[@class='btn-filled']"));     
    Assert.assertTrue(Nextbtn.isEnabled(), "Next Button is enabled:  Navigate to Document upload page");
    }
   
    @AfterClass
    public void tearDown() 
    {
        
        driver.quit();
        
    }

}