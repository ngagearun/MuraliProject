package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PreConditionStepDefinations {
 
 static WebDriver driver;
	
  @BeforeTest(groups={"regression","smoke","sanity"})
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	  driver.navigate().to("https://candidate.psiexams.com/index.jsp");
  }

  
  
  @AfterTest(groups={"regression","smoke","sanity"})
  public void afterTest() {
	  
	  driver.close();
  }

}
