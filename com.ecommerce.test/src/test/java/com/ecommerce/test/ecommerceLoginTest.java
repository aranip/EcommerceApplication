package com.ecommerce.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ecommerceLoginTest extends TestBase implements EcommerceConstant{

	
	//1.checking the url title
	//private static final String EMAIL = "email";

	@Test
	public void UrlTitle() throws InterruptedException{
	   
	   	driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	       WebElement username = driver.findElement(By.name(EMAIL));
	         username.sendKeys(USER_EMAIL);
	     	Thread.sleep(1000);
	         driver.findElement(By.name(PWD)).sendKeys(USER_PWD);
			   	Thread.sleep(1000);
	         String title = driver.getTitle();
		        System.out.println(title);
		       // String currentUrl = driver.getCurrentUrl();
			Assert.assertEquals(TITLE, title);
	}
	
	//2. Incorrect username --- space
	@Test
	public void BlankUserName() throws InterruptedException{
	   	//driver.get("http://ecommerce.saipratap.net/");
	       driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.name(EMAIL)).sendKeys(" ");
	   	Thread.sleep(1000);
	   	driver.findElement(By.name(PWD)).sendKeys(USER_PWD);
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
	   	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/span")).getText();
	   	System.out.println(s);
	   Assert.assertEquals(TITLE1, s);	        
	
	}
	
	//3. validate the email
	@Test
	public void validateemail() throws InterruptedException{
		driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	       WebElement username = driver.findElement(By.name(EMAIL));
	         username.sendKeys(USER_EMAIL);
	     	Thread.sleep(1000);
	         driver.findElement(By.name(PWD)).sendKeys(USER_PWD);
			   	Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
			String s1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div")).getText();
			        System.out.println(s1);
			        Assert.assertEquals(TITLE2, s1);	        
	}
	
	 // 4. Incorrect username 	
	@Test
	public void IncorrectUserName() throws InterruptedException{
		 driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.name(EMAIL)).sendKeys("chit@gmail.com ");
	   	Thread.sleep(1000);
	   	driver.findElement(By.name(PWD)).sendKeys("chitra121");
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
	   	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/span")).getText();
	   	System.out.println(s);
	   	Assert.assertEquals(TITLE1, s);	
	}
	
	 // 5.Incorrect username ----- specialcharacters
	@Test
	public void NameWithSpclChrts() throws InterruptedException{
		 driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.name(EMAIL)).sendKeys("@#$%^&*! ");
	   	Thread.sleep(1000);
	   	driver.findElement(By.name(PWD)).sendKeys("chitra121");
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
	   	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/span")).getText();
	   	System.out.println(s);
		Assert.assertEquals(TITLE1, s);	
	}
	
	// 6. Incorrect username ----- with numbers
	@Test
	public void NameWithNumbers() throws InterruptedException{
		driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.name(EMAIL)).sendKeys("1234765675");
	   	Thread.sleep(1000);
	   	driver.findElement(By.name(PWD)).sendKeys("chitra121");
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
	   	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/span")).getText();
	   	System.out.println(s);
	   	Assert.assertEquals(TITLE1, s);	
	}
	
	// 7. Incorrect username ----- with uppercase
	@Test
	public void NameWithUppercase() throws InterruptedException{
	       driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.name(EMAIL)).sendKeys("QWECDSFR@GMAIL.COM");
	   	Thread.sleep(1000);
	   	driver.findElement(By.name(PWD)).sendKeys("chitra121");
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
	   	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/span")).getText();
	   	System.out.println(s);
	   	Assert.assertEquals(TITLE1, s);	
	}
	
	//8. Incorrect Password
	@Test
	public void IncorrectPWD() throws InterruptedException{
	       driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.name(EMAIL)).sendKeys("chitraaaaaaa@gmail.co");
	   	Thread.sleep(1000);
	   	driver.findElement(By.name(PWD)).sendKeys("chitr");
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
	   	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/span")).getText();
	   	System.out.println(s);
	   	Assert.assertEquals(TITLE1, s);	
	}
	
	//9. Incorrect Password------with space
		@Test
		public void PWDWithSpace() throws InterruptedException{
			 driver.findElement(By.linkText("ACCOUNT")).click();
		       Thread.sleep(1000);
		       driver.findElement(By.name(EMAIL)).sendKeys("chitraaaaaaa@gmail.co");
		   	Thread.sleep(1000);
		   	driver.findElement(By.name(PWD)).sendKeys("  ");
		   	Thread.sleep(1000);
		   	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
		   	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/span")).getText();
		   	System.out.println(s);
		 	Assert.assertEquals(TITLE1, s);	
		}
		
	//10. Incorrect Password------with *******
		@Test
		public void PWDWithAsterik() throws InterruptedException{
			driver.findElement(By.linkText("ACCOUNT")).click();
			Thread.sleep(1000);
		    driver.findElement(By.name(EMAIL)).sendKeys("chitraaaaaaa@gmail.co");
		    Thread.sleep(1000);
		    driver.findElement(By.name(PWD)).sendKeys("***************");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
			String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/span")).getText();
			System.out.println(s);
			Assert.assertEquals(TITLE1, s);	
				}
	//11. Incorrect Password------with @#$%%%#@!
		@Test
		public void PWDWithSpclChrts() throws InterruptedException{
			driver.findElement(By.linkText("ACCOUNT")).click();
			 Thread.sleep(1000);
		    driver.findElement(By.name(EMAIL)).sendKeys("chitraaaaaaa@gmail.co");
		 	Thread.sleep(1000);
		   	driver.findElement(By.name(PWD)).sendKeys("@#$%#$%~!@#$%^");
		   	Thread.sleep(1000);
		  	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
		  	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/span")).getText();
		 	System.out.println(s);
			Assert.assertEquals(TITLE1, s);	
				}	
				
	// 12.	Verify the ‘Forgot Password’ functionality.
		@Test
		public void ForgotPWD() throws InterruptedException{
		       driver.findElement(By.linkText("ACCOUNT")).click();
		       Thread.sleep(1000);
		       driver.findElement(By.name(EMAIL)).sendKeys("chitraaaaaaa@gmail.co");
		   	Thread.sleep(1000);
		   	driver.findElement(By.name(PWD)).sendKeys("");
		   	Thread.sleep(1000);
		   	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[4]/td/a")).click();
		   	driver.findElement(By.name("mail_address")).sendKeys("chitraaaa@gmail.com");
		   	driver.findElement(By.name("Submit")).click();
		   	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div[2]")).getText();
		   	System.out.println("The value is" +s);		
	   	Assert.assertEquals("This email address wasn't found in our database you can create a new account if you wish by clicking the ACCOUNT button in the main menu.", s);
		}
		
		//13.Verify the login page when both the fields are blank and Submit button is clicked.
	@Test
	public void BothFieldsBlank() throws InterruptedException {
	      driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.name(EMAIL)).sendKeys("");
	   	Thread.sleep(1000);
	   	driver.findElement(By.name(PWD)).sendKeys("");
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
	   	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/span")).getText();
	   	System.out.println(s);
	 	Assert.assertEquals(TITLE1, s);
	}
		
	// 14.Verify if the data in password field is either visible as asterisk or bullet signs.
	@Test
	public void PWDAsterickVisible() throws InterruptedException {
	 driver.findElement(By.linkText("ACCOUNT")).click();
     Thread.sleep(1000);
     driver.findElement(By.name(EMAIL)).sendKeys("chitraaaa@gmail.com");
 	Thread.sleep(1000);
 	driver.findElement(By.name(PWD)).sendKeys("************");
 	Thread.sleep(1000);
 	WebElement input = driver.findElement(By.xpath("//*[@id='password']"));
 	boolean isEncrypted = input.getAttribute("type").equals("password");
 	System.out.println(isEncrypted);
 	Assert.assertEquals(true, isEncrypted);
 	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();	
 	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/span")).getText();
 	System.out.println(s);
	 //  	Assert.assertEquals("Invalid Username / Password!", s);
  
	}
		
	// 15.Verify the login page by pressing ‘Back button’ of the browser. It should not allow you to enter into the system once you log out.
	@Test
	public void BackButtonFunctionality() throws InterruptedException {
		  driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.name(EMAIL)).sendKeys("chitraaaaaaa@gmail.com");
	   	Thread.sleep(1000);
	   	driver.findElement(By.name(PWD)).sendKeys("chitra121");
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
	   	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div")).getText();
	   	System.out.println(s);
	   	Assert.assertEquals("You have Logged In successfully.", s);	
	   driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/div/ul/li[10]/a")).click();  //logout
	   Thread.sleep(1000);
	   String s1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div[1]")).getText();
	   System.out.println(s1);
	   Assert.assertEquals("Welcome to Ez Shop Online",s1);
	   Thread.sleep(1000);
	   	driver.navigate().back();
	   driver.get("http://ecommerce.saipratap.net/thankyoumessage.php?msg=login"); 
	   Thread.sleep(1000);
	   driver.navigate().back();
	    String s3 =driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div")).getText();
	   	System.out.println(s3);
	   	Assert.assertEquals("Welcome, Please login to your account.",s3);
	    driver.navigate().forward();
		   driver.get("http://ecommerce.saipratap.net/index.php");
	   	System.out.println(s);
	   	Assert.assertEquals(TITLE2, s);
	}
		
	// 16. Verify wheteher you can erase the entered text or not?
	@Test
	public void EraseEnteredText() throws InterruptedException {
		 driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	       WebElement username = driver.findElement(By.name(EMAIL));
	         username.sendKeys("chitraaaaaaa@gmail.com");
		      username.clear();
		      username.sendKeys("chitraaaaaaa@gmail.com");
	   	Thread.sleep(1000);
	   	driver.findElement(By.name(PWD)).sendKeys("chitra121");
	   	Thread.sleep(1000);
	   	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
	String s1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div")).getText();
	        System.out.println(s1);
		
	}
	
	// 17. Verify if a user cannot enter the characters more than the specified range in each field 
			
}
