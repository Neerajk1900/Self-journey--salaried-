package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class Personaldetailpage extends Base {
	

	public Personaldetailpage() 
	   {
		PageFactory.initElements(driver , this);
	  }
	
	@FindBy(xpath="//mat-select[@formcontrolname='nameCC']")
	WebElement nameoncard;
	
	//@FindBy(xpath="//span[text()=' Wasim Ayub Sheikh ']")
	
	@FindBy(xpath="//span[text()=' KUNJ D SHAH ']")
	WebElement nameselect;
	
	@FindBy(xpath="//input[@formcontrolname='motherName']")
	WebElement mothersname;
	
	@FindBy(xpath="//input[@formcontrolname='personalEmail']")
	WebElement mailid;
	
	@FindBy(xpath="//button[text()=' Next ']")
	WebElement clickonnext;
	
	public String validatePersonalDetailPageTitle1()
    {
        return driver.getTitle();
    }
 
    public  EmployeedetailsPage Personaldetails(String mothername) throws InterruptedException
    {
        Thread.sleep(5000);

    	nameoncard.click();
        Thread.sleep(5000);

    	nameselect.click();
        Thread.sleep(4000);

    	mothersname.sendKeys(mothername);
        Thread.sleep(3000);
       /* mailid.clear();
        Thread.sleep(5000);

        mailid.sendKeys(pmail);
        Thread.sleep(10000);*/

    	clickonnext.click();
        Thread.sleep(10000);

    	
    	return new EmployeedetailsPage();
    }
    }
	
