package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.automation.pages.LoginPage;
import com.automation.testcases.LoginPageTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

@Configuration
@ComponentScan(basePackages = "com.automation")
public class AppConfig {

	WebDriver driver;
	
	@Bean
	public WebDriver create_chromedriver()
	{
		ChromeDriverManager.chromedriver().setup();
	     driver= new ChromeDriver();
	     
	     return driver;
	}
	
	@Bean
	public WebDriverWait createWebDriverWait()
	{
		return new WebDriverWait(driver, 5);
	}
	
	/*
	 * @Bean public LoginPage loginpage() { return new LoginPage(driver); }
	 */
	
	/*
	 * @Bean public WebDriver firefoxdriver() {
	 * FirefoxDriverManager.firefoxdriver().setup(); driver= new FirefoxDriver();
	 * 
	 * return driver; }
	 */
}
