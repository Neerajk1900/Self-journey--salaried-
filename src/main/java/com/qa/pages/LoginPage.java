package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.util.Base;

public class LoginPage extends Base {
	
	
	//Initializing the Page Objects:
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//input[@id='mat-input-0']")  // enter mobile no
		WebElement mobileno;
		
		@FindBy(xpath="//div[@class='mat-checkbox-inner-container']")
		WebElement loginchkbox;
		
		@FindBy(xpath="//button[text()=' Get OTP ']")
		WebElement getotpbtn;
		
		@FindBy(xpath="//input[@id='mat-input-2']")
		WebElement panno;
		
		@FindBy(xpath="//button[text()=' Proceed ']")
		WebElement clickonproceedbtn;
		
		@FindBy(xpath= "//div[starts-with(text(),'CS')]")
		WebElement leadid;
		
		 public String validateLoginPageUrl() {
		        return driver.getCurrentUrl();
		    }
		    
		    public String validateLoginPageTitle() {
		        return driver.getTitle();
		    }
		    
		    public boolean mobileFieldDisplayed()
		    {
		    boolean	mob= mobileno.isDisplayed();
		    return mob;
		    }
		    
		    public boolean mobileFieldEnabled()
		    {
		    	boolean c= mobileno.isEnabled();
				return c;	    	
		    }
			
			public void MobileNumberValidation() {

		    // Enter a 10-digit mobile number
		    mobileno.sendKeys("678969696");
           // Trigger any relevant action (e.g., form submission)
			mobileno.sendKeys(Keys.TAB);
			
			WebElement Validationmessage=driver.findElement(By.xpath("//mat-hint[@id='mat-hint-0']"));
			Assert.assertEquals(Validationmessage.getText(),"Please enter valid 10 digit mobile number.");
			}
			
			public void mobileBlankFieldValidation() {
				loginchkbox.click();
				// Wait for validation message to appear
				WebElement validationMessage = driver.findElement(By.xpath("//mat-hint[@id='mat-hint-0']")); // Replace with your validation message element locator

				// Assert that the validation message text matches the expected message
				Assert.assertEquals(validationMessage.getText(), "Please enter valid 10 digit mobile number.");
			}
			
			  public boolean CheckboxDisplayed()
			    {
			    boolean	chkbox= loginchkbox.isDisplayed();
			    return chkbox;
			    }

		      public boolean validatecheckbox() throws InterruptedException
			  {    	
		    	mobileno.sendKeys("6969696969");
				Thread.sleep(2000);

				boolean c = loginchkbox.isEnabled();
				return c;
			  }
		    
		    public boolean validateOTPbuttonClickable() throws InterruptedException
			  {
		    	mobileno.sendKeys("6969696969");
				loginchkbox.click();
				  Thread.sleep(5000);
		    	boolean c=getotpbtn.isEnabled();
				return c;
			  }
		    
		    public void OTPVerificationTimer() throws InterruptedException {
		    	mobileno.sendKeys("6969696969");
				Thread.sleep(2000);

				loginchkbox.click();
				Thread.sleep(5000);
				getotpbtn.click();	        
		        
		        // Wait for the OTP verifying timer to appear (adjust the timeout as needed)
		        try {
		            Thread.sleep(5000); // Adjust the sleep time based on your application's behavior
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Locate the OTP timer element
		        WebElement otpTimer = driver.findElement(By.xpath("(//span[@class='para-resend ng-star-inserted'])[1]")); // Replace with the actual element locator

		        // Verify if the OTP timer is displayed on the screen
		        Assert.assertTrue(otpTimer.isDisplayed(), "OTP verifying timer is not displayed on the screen.");
		    }

			  
		    
		
		public boolean panFieldDisplayed() throws InterruptedException {
			Thread.sleep(2000);
			mobileno.clear();
			mobileno.sendKeys("6969696969");
			Thread.sleep(2000);

			loginchkbox.click();
			Thread.sleep(5000);
			getotpbtn.click();
			Thread.sleep(5000);
			WebElement otp1 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][1]"));
			otp1.click();
			otp1.sendKeys("1");
			Thread.sleep(1000);
			System.out.println("a");
			
			WebElement otp2 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][2]"));
			otp2.click();
			otp2.sendKeys("2");
			Thread.sleep(1000);
			System.out.println("b");
			
			WebElement otp3 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][3]"));
			otp3.click();
			otp3.sendKeys("3");
			Thread.sleep(1000);
			System.out.println("c");
			
			WebElement otp4 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][4]"));
			otp4.click();
			otp4.sendKeys("4");
			Thread.sleep(1000);
			System.out.println("d");
			
			WebElement otp5 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][5]"));
			otp5.click();
			otp5.sendKeys("5");
			Thread.sleep(1000);
			System.out.println("e");
			
			WebElement otp6 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][6]"));
			otp6.click();
			otp6.sendKeys("6");
			Thread.sleep(1000);
			System.out.println("f");
			Thread.sleep(10000);
			boolean p = panno.isDisplayed();
			return p;
		}
		

		
		public boolean panFieldClickable() throws InterruptedException {

			
			mobileno.sendKeys("6969696969");
			Thread.sleep(2000);

			loginchkbox.click();
			Thread.sleep(5000);
			getotpbtn.click();
			Thread.sleep(5000);
			WebElement otp1 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][1]"));
			otp1.click();
			otp1.sendKeys("1");
			Thread.sleep(1000);
			System.out.println("a");
			
			WebElement otp2 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][2]"));
			otp2.click();
			otp2.sendKeys("2");
			Thread.sleep(1000);
			System.out.println("b");
			
			WebElement otp3 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][3]"));
			otp3.click();
			otp3.sendKeys("3");
			Thread.sleep(1000);
			System.out.println("c");
			
			WebElement otp4 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][4]"));
			otp4.click();
			otp4.sendKeys("4");
			Thread.sleep(1000);
			System.out.println("d");
			
			WebElement otp5 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][5]"));
			otp5.click();
			otp5.sendKeys("5");
			Thread.sleep(1000);
			System.out.println("e");
			
			WebElement otp6 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][6]"));
			otp6.click();
			otp6.sendKeys("6");
			Thread.sleep(1000);
			System.out.println("f");
			Thread.sleep(5000);
			boolean c = panno.isEnabled();
			return c;
		   }
		
		   public void panNumberValidation() throws InterruptedException {

			Thread.sleep(2000);
			mobileno.clear();
			mobileno.sendKeys("6969696969");
			Thread.sleep(2000);

			loginchkbox.click();
			Thread.sleep(5000);
			getotpbtn.click();
			
			Thread.sleep(5000);

			WebElement otp1 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][1]"));
			otp1.click();
			otp1.sendKeys("1");
			Thread.sleep(1000);
			System.out.println("a");
			
			WebElement otp2 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][2]"));
			otp2.click();
			otp2.sendKeys("2");
			Thread.sleep(1000);
			System.out.println("b");
			
			WebElement otp3 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][3]"));
			otp3.click();
			otp3.sendKeys("3");
			Thread.sleep(1000);
			System.out.println("c");
			
			WebElement otp4 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][4]"));
			otp4.click();
			otp4.sendKeys("4");
			Thread.sleep(1000);
			System.out.println("d");
			
			WebElement otp5 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][5]"));
			otp5.click();
			otp5.sendKeys("5");
			Thread.sleep(1000);
			System.out.println("e");
			
			WebElement otp6 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][6]"));
			otp6.click();
			otp6.sendKeys("6");
			Thread.sleep(1000);
			System.out.println("f");
			Thread.sleep(1000);
			panno.sendKeys("PA5555");
			panno.sendKeys(Keys.TAB);
			Thread.sleep(5000);
			// Wait for validation message to appear
			WebElement validationMessage = driver.findElement(By.xpath("//mat-hint[@id='mat-hint-0']")); // Replace with your validation message element locator

			// Assert that the validation message text matches the expected message
			Assert.assertEquals(validationMessage.getText(), "Please enter a valid PAN");
		}
		   
		   public boolean ProceedbuttonEnable() throws InterruptedException {

				mobileno.sendKeys("6969696969");
				Thread.sleep(2000);

				loginchkbox.click();
				Thread.sleep(5000);
				getotpbtn.click();
				
				Thread.sleep(5000);
				WebElement otp1 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][1]"));
				otp1.click();
				otp1.sendKeys("1");
				Thread.sleep(1000);
				System.out.println("a");
				
				WebElement otp2 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][2]"));
				otp2.click();
				otp2.sendKeys("2");
				Thread.sleep(1000);
				System.out.println("b");
				
				WebElement otp3 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][3]"));
				otp3.click();
				otp3.sendKeys("3");
				Thread.sleep(1000);
				System.out.println("c");
				
				WebElement otp4 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][4]"));
				otp4.click();
				otp4.sendKeys("4");
				Thread.sleep(1000);
				System.out.println("d");
				
				WebElement otp5 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][5]"));
				otp5.click();
				otp5.sendKeys("5");
				Thread.sleep(1000);
				System.out.println("e");
				
				WebElement otp6 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][6]"));
				otp6.click();
				otp6.sendKeys("6");
				Thread.sleep(1000);
				System.out.println("f");	
				Thread.sleep(5000);
				panno.sendKeys("ECLPS5505P");
				Thread.sleep(10000);
				boolean c = clickonproceedbtn.isEnabled();
				return c;

			}
		
		   
		
		public void NSDLValidation() throws InterruptedException {


			mobileno.sendKeys("6969696969");
			Thread.sleep(2000);

			loginchkbox.click();
			Thread.sleep(5000);
			getotpbtn.click();
			
			Thread.sleep(5000);
			WebElement otp1 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][1]"));
			otp1.click();
			otp1.sendKeys("1");
			Thread.sleep(1000);
			System.out.println("a");
			
			WebElement otp2 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][2]"));
			otp2.click();
			otp2.sendKeys("2");
			Thread.sleep(1000);
			System.out.println("b");
			
			WebElement otp3 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][3]"));
			otp3.click();
			otp3.sendKeys("3");
			Thread.sleep(1000);
			System.out.println("c");
			
			WebElement otp4 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][4]"));
			otp4.click();
			otp4.sendKeys("4");
			Thread.sleep(1000);
			System.out.println("d");
			
			WebElement otp5 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][5]"));
			otp5.click();
			otp5.sendKeys("5");
			Thread.sleep(1000);
			System.out.println("e");
			
			WebElement otp6 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][6]"));
			otp6.click();
			otp6.sendKeys("6");
			Thread.sleep(1000);
			System.out.println("f");	
			Thread.sleep(5000);
			panno.sendKeys("ECLPS5505P");
			Thread.sleep(10000);
			clickonproceedbtn.click();
			Thread.sleep(2000);

			// Wait for validation message to appear
			//WebElement validationMessagepan = driver.findElement(By.className("mat-hint text-success text-bold ng-tns-c94-6 ng-star-inserted")); // Replace with your validation message element locator

			// Assert that the validation message text matches the expected message
			//Assert.assertEquals(validationMessagepan.getText(), "Name as per PAN : *U*J D*R*H*N*H*I S*A*");

			WebElement lead = driver.findElement(By.className("text-light")); // Replace with your validation message element locator

			// Assert that the validation message text matches the expected message
			Assert.assertEquals(lead.getText(), "Lead ID:  ");
		}
		
		public Cifselectionpage login(String mobile, String Pan) throws Exception
		{
			Thread.sleep(3000);		 
			mobileno.sendKeys(mobile);			
			Thread.sleep(2000);
			loginchkbox.click();
			getotpbtn.click();
			Thread.sleep(7000);
			
			WebElement otp1 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][1]"));
			otp1.click();
			otp1.sendKeys("1");
			Thread.sleep(1000);
			System.out.println("a");
			
			WebElement otp2 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][2]"));
			otp2.click();
			otp2.sendKeys("2");
			Thread.sleep(1000);
			System.out.println("b");
			
			WebElement otp3 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][3]"));
			otp3.click();
			otp3.sendKeys("3");
			Thread.sleep(1000);
			System.out.println("c");
			
			WebElement otp4 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][4]"));
			otp4.click();
			otp4.sendKeys("4");
			Thread.sleep(1000);
			System.out.println("d");
			
			WebElement otp5 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][5]"));
			otp5.click();
			otp5.sendKeys("5");
			Thread.sleep(1000);
			System.out.println("e");
			
			WebElement otp6 = driver.findElement(By.xpath("//input[starts-with(@id,'otp')][6]"));
			otp6.click();
			otp6.sendKeys("6");
			Thread.sleep(1000);
			System.out.println("f");	
			
			panno.sendKeys(Pan);
			clickonproceedbtn.click();			
			String Leadid = leadid.getText();			
			Thread.sleep(7000);
		    System.out.println(" Leadid : " + Leadid);
			
		 return new Cifselectionpage();	
		}
		
	
}
