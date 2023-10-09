package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class DocumentuploadPage extends Base {
		

		public DocumentuploadPage() 
		   {
			PageFactory.initElements(driver , this);
		  }
		
		@FindBy(xpath="(//input[@type='file'])[1]")
		WebElement salaryslip;
		@FindBy(xpath="//body[1]/app-root[1]/div[1]/app-upload-document[1]/div[1]/div[1]/form[1]/div[3]/div[2]/input[1]")
		WebElement salaryslip1;

		@FindBy(xpath="(//input[@type='file'])[2]")
		WebElement Bankstatement;
		@FindBy(xpath="//body[1]/app-root[1]/div[1]/app-upload-document[1]/div[1]/div[1]/form[1]/div[5]/div[2]/input[1]")
		WebElement Bankstatement2;
		
		@FindBy(xpath="//body[1]/app-root[1]/div[1]/app-upload-document[1]/div[1]/div[1]/form[1]/div[5]/div[3]/input[1]")
		WebElement Bankstatement3;

		@FindBy(xpath="//button[@class='btn-filled']")
		WebElement clickonnextbutton;
		
		@FindBy(xpath="//div[@class='container-subheading']")
		WebElement Applicationsubmitmessage;
		
		@FindBy(xpath= "//button[text()='OK']")
		WebElement clickonokbutton;
		
		public void uploadtest() throws InterruptedException {
	        Thread.sleep(10000);  

			salaryslip.sendKeys("C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png");
	        Thread.sleep(10000);
	        
		    JavascriptExecutor js=(JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].click();" ,salaryslip1);
	        Thread.sleep(10000);
	    	salaryslip1.sendKeys("C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png");

	        System.out.println("Successfully uploaded SalarySlip Document");
	        Thread.sleep(5000);

			Bankstatement.sendKeys("C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png");
	        Thread.sleep(10000); 
	        System.out.println("uploaded 1 month Bank Statement");

	        
	    	js.executeScript("arguments[0].click();" ,Bankstatement2);
	        Thread.sleep(10000);  
	    	Bankstatement2.sendKeys("C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png");


	    	js.executeScript("arguments[0].click();" ,Bankstatement3);
	         Thread.sleep(10000);        
	     	Bankstatement3.sendKeys("C:\\Users\\neeraj.kishore\\Desktop\\All Icon\\Jordanss.png");
	        System.out.println("Successfully uploaded 3 months Bank Statement");

	         Thread.sleep(7000); 

	          clickonnextbutton.click();
	         Thread.sleep(10000); 
	         
	        // String Cardsummary= driver.findElement(By.xpath("//div[@class='container-subheading']")).getText(); 
		     System.out.println(Applicationsubmitmessage.getText()); 
		     
	         Thread.sleep(5000); 

	        clickonokbutton.click();
	        
	         Thread.sleep(7000); 

	        System.out.println(" Application Submitted Successfully");
		       
		    System.out.println(" Application Under Review ");
	        
		}

}
