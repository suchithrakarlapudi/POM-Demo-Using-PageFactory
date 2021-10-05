package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component
public class LoginPage {

	 
	WebDriver driver;
	
	/*
	 * @Autowired WebDriverWait driverwait;
	 */
    
	@FindBy(id="login_userName") 
	 private WebElement EmailId;
	 
	@FindBy(id="login_password")
	 private WebElement Password;
	 
	@FindBy(xpath="//span[text()='Log in']//ancestor::button")
	 private WebElement Login;
	
	 
	 public LoginPage(WebDriver driver)
	 {
	       this.driver=driver;
	        PageFactory.initElements(this.driver,this); 
	 }
	
	 public void typeEmailId(String Id)
	 {
	    EmailId.sendKeys(Id);
		// driverwait.until(ExpectedConditions.visibilityOf(EmailId)).sendKeys(Id);
	 }
	 
	 public void typePassword(String PasswordValue)
	 {
	    Password.sendKeys(PasswordValue);
	   // driverwait.until(ExpectedConditions.visibilityOf(Password)).sendKeys(PasswordValue);
	 }
	 
	 public void clickSignIn(){
	    	Login.click();
		// driverwait.until(ExpectedConditions.elementToBeClickable(Login)).click();
	  }
	 
	 public void loadWebSite(String url)
	 {
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get(url);
		 
		 
		String actualTitle = driver.getTitle();
		String expectedTitle="Dashboard";
		
		if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
		
		
		 
	 }
	 
	 
	
}
