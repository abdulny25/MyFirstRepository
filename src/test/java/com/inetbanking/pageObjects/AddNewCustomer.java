package com.inetbanking.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	
	public WebDriver Idriver;
	
	public void AddCustomer(WebDriver rdriver){
		Idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//WebElement newCustomer = driver.findElement(By.xpath("//a[text()='New Customer']"));
	//WebElement custName = driver.findElement(By.xpath("//input[@name='name']"));
	//WebElement genderButton = driver.findElement(By.name("rad1"));
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement newCustomer;
	
	@FindBy(how = How.XPATH, using = "//input[@name='name']")
	@CacheLookup
	WebElement custName;
	
	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement genderButton;
	
	public void ClickNewCustomer() {
		newCustomer.click();
	}
	
	public void TypeCustName(String custname) {
		custName.sendKeys(custname);
	}
	
	public void clickGenderButton() {
		genderButton.click();
	}

}
