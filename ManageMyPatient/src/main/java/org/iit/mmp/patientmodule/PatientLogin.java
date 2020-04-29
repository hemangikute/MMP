package org.iit.mmp.patientmodule;

import java.util.HashMap;

import org.iit.mmp.HelperMethods.HelperMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PatientLogin {
	
WebDriver driver;
	
	public PatientLogin(WebDriver driver) 
	{
		this.driver = driver;

	}
	

    

	public void patientLogin(String username, String password) throws Exception
	{
						
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

		driver.findElement(By.name("submit")).click();
	
		
		HelperMethod submenu = new HelperMethod(driver);
		submenu.navigateToSubMenu(" Profile ");
		
		
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		driver.findElement(By.name("submit")).click();
		
		
	}
	
	public String fetchUname()
	{
		String unameValue = driver.findElement(By.xpath("//span[@class='username']")).getText();
		return unameValue;
	}
	
}
