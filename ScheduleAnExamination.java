package com.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScheduleAnExamination extends PreConditionStepDefinations {
	
	@BeforeClass(groups={"regression","smoke","sanity"})	
	public void clickschedulelink(){
	
		driver.findElement(By.linkText("Schedule")).click();		
	}
	
	@Test(groups="regression")
	public void signinusersecureserver(){
		
		driver.findElement(By.name("emailid")).sendKeys("arun1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789Aa@");
		driver.findElement(By.name("loginbtn")).click();
	     String title =driver.findElement(By.id("welcomeDiv")).getText();
	     Assert.assertEquals("Welcome arun kumar", title);
	}

}
