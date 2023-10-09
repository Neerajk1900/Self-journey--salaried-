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

public class DocumentuploadPageTest extends Base {
	
	   
		public WebDriver driver;
		LoginPage loginpage;
		Cifselectionpage cifselectionpage;
	    Communicationscreenpage communicationscreen;
	    OfficeaddressdetailsPage officeaddress;
	    Personaldetailpage personaldetails;
	    EmployeedetailsPage employeedetailsPage;
	    Summaryscreenpage summaryscreenpage;
	    DocumentuploadPage uploaddocument;
	    
	    public DocumentuploadPageTest()
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
	   
	  @JiraPolicy(logTicketReady=true)

	  @Test(priority=5, enabled=true)
	   public void EmpTest() throws InterruptedException
	   {
		   employeedetailsPage = new EmployeedetailsPage();   
		   uploaddocument = employeedetailsPage.employeedetail(prop.getProperty("Designation"),prop.getProperty("Monthlysalary"),"Decimal");
		
	   }   
	   
	  /* @Test(priority=5, enabled=true)
	   public void EmpTest() throws InterruptedException
	   {
		   employeedetailsPage = new N_EmployeedetailsPage();   
		   summaryscreenpage = employeedetailsPage.employeedetail(prop.getProperty("Designation"),prop.getProperty("Monthlysalary"),"Decimal");
		
	   } 
	  
	    @JiraPolicy(logTicketReady=true)
	   @Test(priority=6, enabled=true)
	   public void summary() throws Exception
	   {
	 	   summaryscreenpage =new N_summaryscreenpage();   
	 	   uploaddocument= summaryscreenpage.summary();
	   }   */ 
	    
		@JiraPolicy(logTicketReady=true)

	    @Test(priority=6, enabled=true)
		   public void uploadtest() throws Exception
		   {
	    	   uploaddocument =new DocumentuploadPage();   
		 	   uploaddocument.uploadtest();
		   }
		
		@JiraPolicy(logTicketReady=true)
	    @Test(priority=7, enabled=true)  	
	    public void uploadSSlip1() throws InterruptedException{
	    WebElement Salaryslip1 = driver.findElement(By.xpath("(//input[@type='file'])[1]"));     
	    Assert.assertTrue(Salaryslip1.isEnabled(), "1st Salary slip doc is uploaded");

	    }
		
		@JiraPolicy(logTicketReady=true)
	    @Test(priority=8, enabled=true)  	
	    public void uploadSSlip2() throws InterruptedException{
	    WebElement Salaryslip2 = driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/app-upload-document[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]"));     
	    Assert.assertTrue(Salaryslip2.isEnabled(), "2nd Salary slip doc is uploaded");
		System.out.println("Salary slip is uploaded successfully");

	    }
		
		@JiraPolicy(logTicketReady=true)
	    @Test(priority=9, enabled=true)  	
	    public void Bankstatement1() throws InterruptedException{
	    WebElement Bstatement1 = driver.findElement(By.xpath("(//input[@type='file'])[2]"));     
	    Assert.assertTrue(Bstatement1.isEnabled(), "1st Bank Statement document is uploaded");

	    }
		
		@JiraPolicy(logTicketReady=true)
	    @Test(priority=10, enabled=true)  	
	    public void Bankstatement2() throws InterruptedException{
	    WebElement Bstatement2 = driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/app-upload-document[1]/div[1]/div[1]/form[1]/div[5]/div[2]/input[1]"));     
	    Assert.assertTrue(Bstatement2.isEnabled(), "2nd Bank Statement document is uploaded");
	    }
		
		@JiraPolicy(logTicketReady=true)
	    @Test(priority=11, enabled=true)  	
	    public void Bankstatement3() throws InterruptedException{
	    WebElement Bstatement3 = driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/app-upload-document[1]/div[1]/div[1]/form[1]/div[5]/div[3]/input[1]"));     
	    Assert.assertTrue(Bstatement3.isEnabled(), "3rd Bank Statement document is uploaded");
		System.out.println("Bank Statement doc uploaded successfully");
		}
		

		@JiraPolicy(logTicketReady=true)
	    @Test(priority=12, enabled=true)  	
	    public void clknextbtn() throws InterruptedException{
	    WebElement clickNext = driver.findElement(By.xpath("//button[@class='btn-filled']"));     
	    Assert.assertTrue(clickNext.isSelected(), "Next Button is enabled : Navigate to App Submit Page");
		}
		
		@JiraPolicy(logTicketReady=true)
	    @Test(priority=13, enabled=true)  	
	    public void Applicationsubmit() throws InterruptedException{
	    WebElement Appsubmit = driver.findElement(By.xpath("//div[@class='container-subheading']"));     
	    Assert.assertTrue(Appsubmit.isSelected(), "Next Button : OK button is display");
		}
		
		@JiraPolicy(logTicketReady=true)
	    @Test(priority=14, enabled=true)  	
	    public void okbutton() throws InterruptedException{
	    WebElement okbtn = driver.findElement(By.xpath("//button[text()='OK']"));     
	    Assert.assertTrue(okbtn.isEnabled(), "Click on OK button");
	    System.out.println("Lead is submitted now");
		}
		
		
	    @AfterClass
	    public void tearDown() 
	    {
	        
	        driver.quit();
	        
	    }

}
