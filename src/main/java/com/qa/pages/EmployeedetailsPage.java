package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class EmployeedetailsPage extends Base {
	
	public EmployeedetailsPage () 
	   {
		PageFactory.initElements(driver , this);
	  }
	
	@FindBy(xpath="//input[@formcontrolname='companyName']")
	WebElement companyname;
	@FindBy(xpath="(//mat-option[@role='option'])[2]")
	WebElement dropdown2;
	@FindBy(xpath="//input[@formcontrolname='designation']")
	WebElement designation;
	@FindBy(xpath="//input[@formcontrolname='monthlySalary']")
	WebElement monthlySalary;
	@FindBy(xpath="//div[@class='mat-checkbox-inner-container']")
	WebElement chktermcondition;
	@FindBy(css="button.btn-filled")
	WebElement buttonfilled;
	
	@FindBy(xpath="//button[@class='btn-filled']")
	
	//@FindBy(xpath="//span[text()='Next']") 
	//@FindBy(xpath="//button[@class='btn-filled mr-2']")
	
	WebElement clicknextoncardscreen;
	
	public DocumentuploadPage employeedetail(String Designation, String Monthlysalary, String Company) throws InterruptedException
	
	//public N_summaryscreenpage employeedetail(String Designation, String Monthlysalary, String Company) throws InterruptedException
	{
		companyname.sendKeys(Company);
		Thread.sleep(8000);
		dropdown2.click();
		Thread.sleep(10000);

		designation.sendKeys(Designation);
		Thread.sleep(7000);

		monthlySalary.sendKeys(Monthlysalary);
		Thread.sleep(10000);
		chktermcondition.click();
		Thread.sleep(7000);

		buttonfilled.click();
		Thread.sleep(10000);
		
		Thread.sleep(4000);

		System.out.println("Basis the income mentioned, you are eligible for a Credit Card with a maximum limit of Rs. 6,00,000.Please select a card that suits you best.");
		clicknextoncardscreen.click();
		Thread.sleep(10000);
		
		//return new N_summaryscreenpage();

		return new DocumentuploadPage();
	}
	}

