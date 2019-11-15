package com.ecommerce.test;

import org.testng.annotations.Test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ecommerceRegistrationTest {
WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
         driver = new ChromeDriver();

        driver.manage().window().maximize();  //maximize window
        driver.manage().deleteAllCookies();  //delete all cookies

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
      //1.launch the url
     	driver.get("http://ecommerce.saipratap.net/");
	}
	
	@Test
	public void ValidRegistration() throws InterruptedException{
		driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	driver.findElement(By.linkText("SignUp")).click();
	Thread.sleep(1000);
	WebElement list =	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[5]/td/table/tbody/tr[1]/td[4]/input[2]"));
	if(!list.isSelected())
	{
	    list.click();
	}
	Thread.sleep(1000);
	
	driver.findElement(By.id("fname")).sendKeys("chitratttrrer");
	Thread.sleep(1000);
	driver.findElement(By.id("lname")).sendKeys("raghaffds");
	Thread.sleep(1000);
	
	driver.findElement(By.name("day")).sendKeys("9");
	Thread.sleep(1000);
	driver.findElement(By.name("month")).sendKeys("10");
	Thread.sleep(1000);
	driver.findElement(By.name("year")).sendKeys("1985");
	Thread.sleep(1000);
	driver.findElement(By.name("email")).sendKeys("chitra24145@gmail.com");
	Thread.sleep(1000);

	driver.findElement(By.name("houseno")).sendKeys("19-4-513");
	Thread.sleep(1000);
	driver.findElement(By.name("add1")).sendKeys("capitol avenue");
	Thread.sleep(1000);
	driver.findElement(By.name("city")).sendKeys("sanjose");
	Thread.sleep(1000);
	driver.findElement(By.name("state")).sendKeys("CA");
	Thread.sleep(1000);
	driver.findElement(By.id("postcode")).sendKeys("95113");
	Thread.sleep(1000);
	driver.findElement(By.name("phone")).sendKeys("6547658765");
	Thread.sleep(1000);
	driver.findElement(By.name("fax")).sendKeys("54326");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("chitra1217787");
	Thread.sleep(1000);
	driver.findElement(By.name("cpassword")).sendKeys("chitra1217787");
	
	Thread.sleep(1000);
	boolean b1 = driver.findElement(By.id("terms")).isSelected();
 System.out.println(b1);
 driver.findElement(By.id("terms")).click();
 System.out.println(b1);
 Thread.sleep(1000);

driver.findElement(By.name("Submit")).click();
 System.out.println("Thank you for signing up. Your account is now created and you can log in by clicking the ACCOUNT button in the main menu above.");
// Assert.assertEquals("Thank you for signing up. Your account is now created and you can log in by clicking the ACCOUNT button in the main menu above.", s);	 
 String s1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td/span")).getText();
 System.out.println(s1);
 
 String s2 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td/span")).getText();
 System.out.println(s2);
 Assert.assertEquals("This email address is already registered.", s2);
	}
	
	@Test
	public void BlankEmailReg() throws InterruptedException{
		
		driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	driver.findElement(By.linkText("SignUp")).click();
	Thread.sleep(1000);
	WebElement list =	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[5]/td/table/tbody/tr[1]/td[4]/input[2]"));
	if(!list.isSelected())
	{
	    list.click();
	}
	Thread.sleep(1000);
	
	driver.findElement(By.id("fname")).sendKeys("chitratttrrer");
	Thread.sleep(1000);
	
	driver.findElement(By.id("lname")).sendKeys("raghaffds");
	Thread.sleep(1000);
	
	driver.findElement(By.name("day")).sendKeys("9");
	Thread.sleep(1000);
	driver.findElement(By.name("month")).sendKeys("10");
	Thread.sleep(1000);
	driver.findElement(By.name("year")).sendKeys("1985");
	Thread.sleep(1000);
//make email blank
//***********************	
	driver.findElement(By.name("email")).sendKeys("");
	Thread.sleep(1000);
	String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td/span")).getText();
	System.out.println(s);
	Assert.assertEquals("", s);
//*************************	
	driver.findElement(By.name("houseno")).sendKeys("19-4-513");
	Thread.sleep(1000);
	driver.findElement(By.name("add1")).sendKeys("capitol avenue");
	Thread.sleep(1000);
	driver.findElement(By.name("city")).sendKeys("sanjose");
	Thread.sleep(1000);
	driver.findElement(By.name("state")).sendKeys("CA");
	Thread.sleep(1000);
	driver.findElement(By.id("postcode")).sendKeys("95113");
	Thread.sleep(1000);
	driver.findElement(By.name("phone")).sendKeys("6547658765");
	Thread.sleep(1000);
	driver.findElement(By.name("fax")).sendKeys("54326");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("chitra1217787");
	Thread.sleep(1000);
	driver.findElement(By.name("cpassword")).sendKeys("chitra1217787");

	Thread.sleep(1000);
	boolean b1 = driver.findElement(By.id("terms")).isSelected();
System.out.println(b1);
driver.findElement(By.id("terms")).click();
System.out.println(b1);
Thread.sleep(1000);

driver.findElement(By.name("Submit")).click();
System.out.println("Thank you for signing up. Your account is now created and you can log in by clicking the ACCOUNT button in the main menu above.");

	}
	
	@Test
	public void InvalidPwd() throws InterruptedException {
			driver.findElement(By.linkText("ACCOUNT")).click();
		       Thread.sleep(1000);
		driver.findElement(By.linkText("SignUp")).click();
		Thread.sleep(1000);
		WebElement list =	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[5]/td/table/tbody/tr[1]/td[4]/input[2]"));
		if(!list.isSelected())
		{
		    list.click();
		}
		Thread.sleep(1000);
		
		driver.findElement(By.id("fname")).sendKeys("chitratttrrer");
		Thread.sleep(1000);	
		driver.findElement(By.id("lname")).sendKeys("raghaffds");
		Thread.sleep(1000);
		driver.findElement(By.name("day")).sendKeys("9");
		Thread.sleep(1000);
		driver.findElement(By.name("month")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.name("year")).sendKeys("1985");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("chitra24145@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("houseno")).sendKeys("19-4-513");
		Thread.sleep(1000);
		driver.findElement(By.name("add1")).sendKeys("capitol avenue");
		Thread.sleep(1000);
		driver.findElement(By.name("city")).sendKeys("sanjose");
		Thread.sleep(1000);
		driver.findElement(By.name("state")).sendKeys("CA");
		Thread.sleep(1000);
		driver.findElement(By.id("postcode")).sendKeys("95113");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("6547658765");
		Thread.sleep(1000);
		driver.findElement(By.name("fax")).sendKeys("54326");
		Thread.sleep(1000);
		
	//negative test cases for registration page
	//*********************************************	
	 driver.findElement(By.name("password")).sendKeys("chitra121");
		Thread.sleep(1000);
		driver.findElement(By.name("cpassword")).sendKeys("chitra1211787");
		Thread.sleep(1000);
	//****************************
		Thread.sleep(1000);
		boolean b1 = driver.findElement(By.id("terms")).isSelected();
	 System.out.println(b1);
	 driver.findElement(By.id("terms")).click();
	 System.out.println(b1);
	 Thread.sleep(1000);

	driver.findElement(By.name("Submit")).click();
	// System.out.println("Thank you for signing up. Your account is now created and you can log in by clicking the ACCOUNT button in the main menu above.");
	 String s1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td/span")).getText();
	System.out.println(s1);
	 
	String s2 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td/span")).getText();
	System.out.println(s2);
	 Assert.assertEquals("This email address is already registered.", s2);
		}
	
	@Test
	public void Terms() throws InterruptedException {
		driver.findElement(By.linkText("ACCOUNT")).click();
	       Thread.sleep(1000);
	driver.findElement(By.linkText("SignUp")).click();
	Thread.sleep(1000);
	WebElement list =	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[5]/td/table/tbody/tr[1]/td[4]/input[2]"));
	if(!list.isSelected())
	{
	    list.click();
	}
	Thread.sleep(1000);
	
	driver.findElement(By.id("fname")).sendKeys("chitratttrrer");
	Thread.sleep(1000);	
	driver.findElement(By.id("lname")).sendKeys("raghaffds");
	Thread.sleep(1000);
	driver.findElement(By.name("day")).sendKeys("9");
	Thread.sleep(1000);
	driver.findElement(By.name("month")).sendKeys("10");
	Thread.sleep(1000);
	driver.findElement(By.name("year")).sendKeys("1985");
	Thread.sleep(1000);
	driver.findElement(By.name("email")).sendKeys("chitra24145@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("houseno")).sendKeys("19-4-513");
	Thread.sleep(1000);
	driver.findElement(By.name("add1")).sendKeys("capitol avenue");
	Thread.sleep(1000);
	driver.findElement(By.name("city")).sendKeys("sanjose");
	Thread.sleep(1000);
	driver.findElement(By.name("state")).sendKeys("CA");
	Thread.sleep(1000);
	driver.findElement(By.id("postcode")).sendKeys("95113");
	Thread.sleep(1000);
	driver.findElement(By.name("phone")).sendKeys("6547658765");
	Thread.sleep(1000);
	driver.findElement(By.name("fax")).sendKeys("54326");
	Thread.sleep(1000);
	
//negative test cases for registration page
//*********************************************	
driver.findElement(By.name("password")).sendKeys("chitra121");
	Thread.sleep(1000);
	driver.findElement(By.name("cpassword")).sendKeys("chitra1211787");
	Thread.sleep(1000);
//****************************
	Thread.sleep(1000);
	boolean b1 = driver.findElement(By.id("terms")).isSelected();
System.out.println(b1);
//driver.findElement(By.id("terms")).click();
//System.out.println(b1);
Thread.sleep(1000);

driver.findElement(By.name("Submit")).click();
String s1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td/span")).getText();
System.out.println(s1);
Assert.assertEquals("You must agree to the terms and conditions before you can sign up.", s1);

//String s2 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td/span")).getText();
//System.out.println(s2);
//Assert.assertEquals("This email address is already registered.", s2);
	}
	@AfterMethod
	  public void teardown() {
	 
	      driver.quit();
	} 
}
