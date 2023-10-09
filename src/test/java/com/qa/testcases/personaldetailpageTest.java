package com.qa.testcases;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.Communicationscreenpage;
import com.qa.pages.EmployeedetailsPage;
import com.qa.pages.LoginPage;
import com.qa.pages.Cifselectionpage;
import com.qa.pages.OfficeaddressdetailsPage;
import com.qa.pages.Personaldetailpage;
import com.qa.util.JiraPolicy;
import com.qa.util.Base;

public class personaldetailpageTest extends  Base{
   
	public WebDriver driver;
	LoginPage loginpage;
	Cifselectionpage cifselectionpage;
    Communicationscreenpage communicationscreen;
    OfficeaddressdetailsPage officeaddress;
    Personaldetailpage personaldetails;
    EmployeedetailsPage employeedetailsPage;
    
    public personaldetailpageTest(){
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
	   	
	    public void Nameoncard() throws InterruptedException{
	    WebElement Namecard = driver.findElement(By.xpath("//span[text()=' KUNJ D SHAH ']"));
	        
	    Assert.assertTrue(Namecard.isSelected(), "Name on card selected");
	    }
	    

	    @JiraPolicy(logTicketReady=true)
	    @Test(priority=6, enabled=true)
	   	
	    public void Mothername() throws InterruptedException{
	    WebElement Mname = driver.findElement(By.xpath("//input[@formcontrolname='motherName']"));
	        
	    Assert.assertTrue(Mname.isEnabled(), "Mother's name field is input text");
	    }
	    
	    @JiraPolicy(logTicketReady=true)
	    @Test(priority=7, enabled=true)
	   	
	    public void personnelemail() throws InterruptedException{
	    
        boolean b6=driver.findElement(By.xpath("//input[@formcontrolname='personalEmail']")).isDisplayed();
		System.out.println("Personal email id is autofilled");
	    }
         
	    @JiraPolicy(logTicketReady=true)
	    @Test(priority=8, enabled=true)
	   	
	    public void clicknextbtn() throws InterruptedException{
	    	
		System.out.println("All mandatory fields are filled");
	    WebElement Nextbtn = driver.findElement(By.xpath("//button[text()=' Next ']"));
	    Assert.assertTrue(Nextbtn.isEnabled(), "click on Next button : Navigate on Employee details page");
	    }
	    
	  
  
    @AfterClass
    public void tearDown() 
    {
        
        driver.quit();
        
    }

}