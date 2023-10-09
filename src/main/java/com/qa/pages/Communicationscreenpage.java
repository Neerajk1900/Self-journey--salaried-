package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class Communicationscreenpage extends Base {

	public Communicationscreenpage() 
	   {
		PageFactory.initElements(driver , this);
	  }
	
	@FindBy(xpath="(//div[@class='mat-radio-container'])[1]")   ///    //div[contains(text(), '122102')]
	//@FindBy(xpath="//label[@for='mat-radio-4-input']//div[@class='mat-radio-inner-circle']")
	WebElement comaddressradiobtn;
  
	@FindBy(xpath="(//div[@class='mat-radio-inner-circle'])[2]")
	WebElement currentaddress;
	
	@FindBy(xpath="//input[@formcontrolname='cLandmark']")
	WebElement commlandmark;
	
	@FindBy(xpath="//input[@formcontrolname='caddress1']")
	WebElement comaddress1;
	@FindBy(xpath="//input[@formcontrolname='caddress2']")
	WebElement comaddress2;
	@FindBy(xpath="//input[@formcontrolname='cpin']")
	WebElement cpin;
	@FindBy(xpath="//button[text()=' Next ']")
	WebElement clkonnextbutton;
	

	public String validateCommunicationscreenPageTitle1()
	{
        return driver.getTitle();
	}
	
	public Communicationscreenpage validatecommunicationpage() throws InterruptedException
	 {    
	    return new Communicationscreenpage();
	 }
	
	 public Communicationscreenpage validatecommunicationaddress() throws InterruptedException
	   {
		 Thread.sleep(5000);
		 comaddressradiobtn.click();
		 Thread.sleep(5000);
		 return new Communicationscreenpage();	    
	   }
	 
	
	public Personaldetailpage communication(String clandmark,String add1, String Add2, String pin) throws Exception
	{
		Thread.sleep(5000);

		comaddressradiobtn.click();
		Thread.sleep(5000);
		currentaddress.click();
		Thread.sleep(10000);
		
		commlandmark.sendKeys(clandmark);
		Thread.sleep(2000);

		comaddress1.sendKeys(add1);
		Thread.sleep(2000);

		comaddress2.sendKeys(Add2);
		Thread.sleep(2000);
		cpin.sendKeys(pin);
		Thread.sleep(8000);
		clkonnextbutton.click();
		Thread.sleep(10000);
		
		System.out.println(driver.getCurrentUrl());

		
		return new Personaldetailpage();		
	}
	
	public String ValidatecommunicationpageURL()
	{
		String communicationpageURL=driver.getCurrentUrl();
		return communicationpageURL;
	}
	
}
