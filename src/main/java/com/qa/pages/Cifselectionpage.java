package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class Cifselectionpage extends Base {
		
	public Cifselectionpage() 
	   {
		PageFactory.initElements(driver , this);
	  }
	
	 public String validateCifSelectionPageUrl()
     {
	        return driver.getCurrentUrl();
     }
 
	@FindBy(xpath="//mat-select[@formcontrolname='empType']")
	WebElement empType;
	//@FindBy(xpath= "//div[@class='mat-select-arrow-wrapper ng-tns-c100-4']") --
	@FindBy(xpath="//mat-select[contains(@formcontrolname,'empType')]")
	WebElement saldropdown ;
	@FindBy(xpath= "//span[normalize-space()='Salaried']")
	WebElement clickonsalaried;
	
	@FindBy(xpath= "//mat-radio-group[@aria-label='Select an option']")
	WebElement cifselection;
	
	//@FindBy(xpath="//label[@for='mat-radio-3-input']//div[@class='address']")     // for data --HLBPS5855L , 9999990996
	
	@FindBy(xpath="//div[@class='mat-radio-label-content']")                  // for data --ECLPS5505P , 6969696969
	WebElement clickonaddress;
	
	@FindBy(xpath="//button[text()=' Next ']")
	WebElement clickonnextbtn;
	
	 public boolean EmpTypeFieldDisplayed()
	    {
	    boolean	emp= empType.isDisplayed();
	    return emp;
	    }
	 
	 public boolean validateEmpDropdown() throws InterruptedException
	    {
		saldropdown.click();
		Thread.sleep(2000);
	    boolean	e= saldropdown.isEnabled();
	    return e;
	    }  
	
		/* List<WebElement> nametypes=driver.findElements(By.xpath("//mat-option[@role='option']//span[contains(text(),'Salaried')]"));
	       
         for(WebElement ntype:nametypes)
         {
        	 
             if(ntype.getText().equals("Salaried"))
             {          ntype.click();
             break;
              } }  
             Thread.sleep(2000);*/
	
	public void SelectEmptypeSalaried() throws InterruptedException
	  {
  	 //JavascriptExecutor js = (JavascriptExecutor) driver;
  	 //js.executeScript("arguments[0].scrollIntoView();", next);
		Thread.sleep(2000);
	    saldropdown.click();
		Thread.sleep(3000);
		clickonsalaried.click();
		Thread.sleep(5000);	
	  }
   
   public boolean cifSelectionDisplayed() throws InterruptedException
	  {	 
	   Thread.sleep(2000);
	    saldropdown.click();
		Thread.sleep(3000);
		clickonsalaried.click();
		Thread.sleep(5000);
		boolean cifdisplayed=cifselection.isEnabled();
		return cifdisplayed;	
	  }
   
  /* public boolean cifSelectionClickable() throws InterruptedException
	  {	 
	   Thread.sleep(2000);
	    saldropdown.click();
		Thread.sleep(3000);
		clickonsalaried.click();
		Thread.sleep(5000);
		clickonaddress.click();
		Thread.sleep(20000);

		boolean cifselected=clickonnextbtn.isEnabled();
		return cifselected;	
	  }*/
   
   public boolean validateNextbtnClickable() throws InterruptedException
	  {
	   Thread.sleep(2000);
	    saldropdown.click();
		Thread.sleep(3000);
		clickonsalaried.click();
		Thread.sleep(5000);
		clickonaddress.click();
		Thread.sleep(10000);
	    //clickonnextbtn.click();
	    boolean c=clickonnextbtn.isEnabled();
		return c;	 
		}
   
   
	
   public Communicationscreenpage cifpage() throws Throwable
	   {
		Thread.sleep(2000);
	    saldropdown.click();
		Thread.sleep(3000);
		clickonsalaried.click();
		Thread.sleep(5000);
         System.out.println("Employment Type : Salaried Selected"); 

		clickonaddress.click();
		Thread.sleep(10000);
        //System.out.println("Address is Selected");

		clickonnextbtn.click();
		Thread.sleep(7000);
		

		return new Communicationscreenpage();

	}  
	
	

}
