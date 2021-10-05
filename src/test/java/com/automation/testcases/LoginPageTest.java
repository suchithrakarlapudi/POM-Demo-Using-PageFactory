package com.automation.testcases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.automation.AppConfig;
import com.automation.pages.LoginPage;

@Test
@ContextConfiguration(classes = AppConfig.class)
public class LoginPageTest extends AbstractTestNGSpringContextTests  {

	
	@Autowired
	LoginPage loginpage;
	
	@Test
	public void test_success()
	{
		//loginpage= new LoginPage(driver);
		loginpage.loadWebSite("https://dashboard.magicfix.in/");
		loginpage.typeEmailId("medari@gmail.com");
		loginpage.typePassword("medari");
		loginpage.clickSignIn();
	}
}
