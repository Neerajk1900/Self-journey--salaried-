package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class OfficeaddressdetailsPage extends Base {
	
	public OfficeaddressdetailsPage() 
	   {
		PageFactory.initElements(driver , this);
	  }
	
	@FindBy(xpath="(//div[@class='mat-radio-container'])[1]")
	WebElement comaddress1;
	@FindBy(xpath="//input[@formcontrolname='caddress2']")
	WebElement comaddress2;
	@FindBy(xpath="//input[@formcontrolname='cpin']")
	WebElement cpin;
	@FindBy(xpath="//button[text()=' Next ']")
	WebElement clkonnextbutton;
	
	public Personaldetailpage officeaddresspage(String add1, String Add2, String pin) throws InterruptedException
	{
		comaddress1.sendKeys(add1);
		Thread.sleep(10000);

		comaddress2.sendKeys(Add2);
		Thread.sleep(10000);
		cpin.sendKeys(pin);
		clkonnextbutton.click();
		Thread.sleep(10000);
		return new Personaldetailpage();
		
	}


	
	

}
