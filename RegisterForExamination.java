package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterForExamination extends PreConditionStepDefinations{
	
	@BeforeClass(groups={"regression","smoke","sanity"})
	
	public void registerForExaminationlink(){
		driver.findElement(By.linkText("Register")).click();
	}
	
	@Test(groups="regression")
	public void registerexamination_Academic(){
		
		Select objname=new Select(driver.findElement(By.id("c0")));
		objname.selectByVisibleText("Academic");
		
	}
	
	@Test(groups="smoke")
	public void registerexamination_FDNY(){
		Select objname=new Select(driver.findElement(By.id("c0")));
		objname.selectByVisibleText("FDNY");

	}
	
	@Test(groups="regression")
	
	public void registerexamination_federalagencies(){	
		Select objname=new Select(driver.findElement(By.id("c0")));
		objname.selectByVisibleText("Federal Agencies");
	}
	
	@AfterClass(groups={"regression","smoke","sanity"})
	public void homepage(){
		driver.findElement(By.linkText("Home")).click();
	}
	

}
