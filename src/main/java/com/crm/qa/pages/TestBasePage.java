package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public abstract class TestBasePage extends TestBase{

	@FindBy(xpath = "//td[contains(text(),'User: Naveen K')]")
	@CacheLookup
	WebElement pageHeader;
	
	@FindBy(xpath = "//td[contains(text(),'User: Naveen K')]")
	@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement PageFooter;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement SiteLogo;
	
//	public TestBasePage() {
//		PageFactory.initElements(driver, this);
//	}
	
	public String verifyHeader(){
		return driver.getTitle();
	}
	
	
	public boolean verifyFooter(){
		return userNameLabel.isDisplayed();
	}
	
	public abstract void undefinedClass();
	
}
