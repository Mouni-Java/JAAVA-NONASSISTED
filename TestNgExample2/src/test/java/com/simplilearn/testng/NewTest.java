package com.simplilearn.testng;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void oracle() throws InterruptedException {
		
	  driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement email= driver.findElement(By.id("sView1:r1:0:email::content"));
		email.sendKeys("mouni@gmail.com");
		Thread.sleep(1000);
		WebElement pass= driver.findElement(By.id("sView1:r1:0:password::content"));
		pass.sendKeys("Cherry@2001");
		Thread.sleep(1000);
		WebElement repass= driver.findElement(By.id("sView1:r1:0:retypePassword::content"));
		repass.sendKeys("Cherry@2001");
		Thread.sleep(1000);
		WebElement country= driver.findElement(By.id("sView1:r1:0:country::content"));
		country.sendKeys("India");
		WebElement fname= driver.findElement(By.id("sView1:r1:0:firstName::content"));
		fname.sendKeys("Mounika");
		Thread.sleep(1000);
		WebElement lname= driver.findElement(By.id("sView1:r1:0:lastName::content"));
		lname.sendKeys("Reddy");
		Thread.sleep(1000);
		WebElement jobtitle= driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		jobtitle.sendKeys("Software Engineer");
		Thread.sleep(1000);
		WebElement phone= driver.findElement(By.id("sView1:r1:0:workPhone::content"));
		phone.sendKeys("993725335");
		Thread.sleep(1000);
		WebElement compname= driver.findElement(By.id("sView1:r1:0:companyName::content"));
		compname.sendKeys("ABC Company");
		Thread.sleep(1000);
		WebElement address= driver.findElement(By.id("sView1:r1:0:address1::content"));
		address.sendKeys("Door No:5-26,Kadiri,Ananthpuram,Andhrapradesh");
		Thread.sleep(1000);
		WebElement city= driver.findElement(By.id("sView1:r1:0:city::content"));
		city.sendKeys("Kadiri");
		Thread.sleep(1000);
		WebElement state= driver.findElement(By.id("sView1:r1:0:state::content"));
		state.sendKeys("Andhra Pradesh");
		Thread.sleep(1000);
		WebElement postalcode= driver.findElement(By.id("sView1:r1:0:postalCode::content"));
		postalcode.sendKeys("523456");
		Thread.sleep(1000);
		WebElement register= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:b1"));
		register.click();
		
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Mphasis-java-pahse5\\\\chromedriver_win32\\\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@AfterMethod
	public void afterMethod() {
		//driver.close();
		driver=null;
	}
	
}

