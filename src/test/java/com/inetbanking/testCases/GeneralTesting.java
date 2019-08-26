package com.inetbanking.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.ReadConfig;

public class GeneralTesting{
		public static WebDriver driver;
		
	public static void main(String[] args) throws InterruptedException {
		logintest();
		addNEWcUSTOMER();
		
	}
	public static void logintest() {
		
		ReadConfig readconfig = new ReadConfig();
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/index.php");
	}
	
	
	public static void addNEWcUSTOMER() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("mngr183684");
		lp.SetPassword("UvAgEge");
		lp.clickSubmit();
		
		
		ClickNewCustomer();
		TypeCustName("Salman");
		Thread.sleep(3000);
		clickGenderButton();
	}
	
	static WebElement newCustomer = driver.findElement(By.xpath("//a[text()='New Customer']"));
	static WebElement custName = driver.findElement(By.xpath("//input[@name='name']"));
	static WebElement genderButton = driver.findElement(By.name("rad1"));
	
	
	
	public static void ClickNewCustomer() {
		newCustomer.click();
	}
	
	public static void TypeCustName(String custname) {
		custName.sendKeys(custname);
	}
	
	public static void clickGenderButton() {
		genderButton.click();
	}

}
