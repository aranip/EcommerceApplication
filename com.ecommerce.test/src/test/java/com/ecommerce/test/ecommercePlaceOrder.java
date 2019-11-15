package com.ecommerce.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ecommercePlaceOrder {
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
	public void OrderPlace() throws InterruptedException {
		driver.findElement(By.linkText("PRODUCTS")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='rightcontent']/p[2]/a/img")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr/td/form[1]/table/tbody/tr[6]/td[3]/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table[1]/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/a/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("email")).sendKeys("chitraaaaaaa@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("chitra121");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table[3]/tbody/tr/td/a/img")).click();

		 String s = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table[2]/tbody/tr/td[1]")).getText();
System.out.println(s);
Assert.assertEquals("Continue to confirm this order.",s);
	}
	@AfterMethod
	  public void teardown() {
	 
	      driver.quit();
	} 
}
