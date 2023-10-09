package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class Summaryscreenpage extends Base{
	
	
	public Summaryscreenpage() 
	   {
		PageFactory.initElements(driver , this);
	  }
	
	
	//@FindBy(xpath= "//span[text()='Next']")

	@FindBy(xpath="//span[text()='Build LIT card']")
	WebElement clickonBuild ;
	
	@FindBy(xpath="//div[text()='Skip for now']")
	WebElement clickonskip;
	
	@FindBy(xpath="//div[text()='Skip feature selection and proceed']")
	WebElement clickonskipfeature;
	

	
	public String validatePageTitle()
    {
        System.out.println(driver.getTitle());

        return driver.getTitle();
       // System.out.println(driver.getTitle());
    }
	
	public DocumentuploadPage summary() throws Exception 
	{
		
		clickonBuild.click();
        Thread.sleep(8000);
        System.out.println(driver.getTitle());
        
        clickonskip.click();     
        Thread.sleep(7000);
        
        clickonskipfeature.click();
        Thread.sleep(7000);
        
       

		return new DocumentuploadPage();
	}

}
