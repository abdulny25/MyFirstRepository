package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddNewCustomer;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddNewCustomer extends BaseClass{

	@Test
	public void addNEWcUSTOMER() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.SetPassword(password);
		lp.clickSubmit();
		
		AddNewCustomer anc = new AddNewCustomer();
		anc.ClickNewCustomer();
		anc.TypeCustName("Salman");
		Thread.sleep(3000);
		anc.clickGenderButton();
	}
	
	
}
