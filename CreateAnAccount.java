package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateAnAccount extends PreConditionStepDefinations{
	
	
	@BeforeClass(groups={"regression","sanity","smoke"})	
	public void opencreateanaccountpage(){
		driver.findElement(By.linkText("Create")).click();		
		
	}
	
	@Test(priority=3,groups="sanity")
	public void createaccountwithvaliddetails(){
		driver.findElement(By.name("emailid")).clear();
		driver.findElement(By.name("emailid")).sendKeys("arun@gmaail.com");
		driver.findElement(By.name("firstname")).sendKeys("arun");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("password")).sendKeys("123456789A@");
		driver.findElement(By.name("confirmpassword")).sendKeys("123456789A@");
		Select objname=new Select(driver.findElement(By.name("hintquestion")));
		objname.selectByIndex(1);
		driver.findElement(By.name("hintanswer")).sendKeys("parrot");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().alert().accept();
	}
	
	@Test(priority=1,groups="regression")
	public void createaccountwithinvaliddetails(){
	
		driver.findElement(By.name("emailid")).sendKeys("arun");
		String expected_value=driver.findElement(By.className("errorInline")).getText();
		Assert.assertEquals(expected_value, "Please provide valid email address.");
	}
	
	@Test(priority=2,groups="smoke")
	
	public void validatecheckbox(){
		
		boolean status =driver.findElement(By.name("existingrecord")).isSelected();
		Assert.assertTrue(status, "The checkbox is selected");
		
	}
	
	@AfterClass(groups={"regression","sanity","smoke"})
	public void homepage(){
		driver.findElement(By.linkText("Home")).click();
	}
	
	

}
