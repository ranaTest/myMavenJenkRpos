package com.myMavenProject.MavenScriptTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoggInTest {
	
	
	@Test
	
	public void loggin() throws Throwable{
		
	System.setProperty("webdriver.chrome.driver", "H:\\myMavenJenkRpos\\myMavenProject\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	Thread.sleep(3000);
	
	}

}
