package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddNewCustomer;
import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException {
	
	
	
	LoginPage lp = new LoginPage(driver);
	
	lp.setUserName(username);
	logger.info("username entered");
	
	lp.SetPassword(password);
	logger.info("password entered");
	
	lp.clickSubmit();
	logger.info("clicked submit button");
	
	Thread.sleep(2000);
	
	AddNewCustomer anc = new AddNewCustomer();
	anc.ClickNewCustomer();
	logger.info("clicked add");
	anc.TypeCustName("Salman");
	logger.info("username entered");
	Thread.sleep(3000);
	anc.clickGenderButton();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
		Assert.assertTrue(true);
		logger.info("login successful");
	}
	else {
		Assert.assertTrue(false);
		logger.info("login fail");
	}

	}




}
