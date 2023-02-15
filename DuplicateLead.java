package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
	 public static void main(String[] args) {
  	   ChromeDriver driver = new ChromeDriver();
    	 //Launch URL "http://leaftaps.com/opentaps/control/login"
			driver.get("http://leaftaps.com/opentaps/control/login");
			//maximize the screen
			driver.manage().window().maximize();
			//Enter UserName and Password Using Id Locator
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			// Click on Login Button using Class Locator
			driver.findElement(By.className("decorativeSubmit")).click();
			
			String text = driver.findElement(By.tagName("h2")).getText();
			System.out.println(text);
			
			//Click on CRM/SFA Link
			driver.findElement(By.linkText("CRM/SFA")).click();
			//Click on leads
			driver.findElement(By.linkText("Leads")).click();
			//Click on Create leads
			driver.findElement(By.partialLinkText("Create")).click();
			//Enter the company name
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
			//Enter the Firstname
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Maddy");
			//Enter the FirstName local
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Madhavan");
			//Enter the Lastname
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
			//Enter the department name
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
			//Enter the Description
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Create a Lead");
			//Enter the PrimaryEmail
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("madhavan2401@gmail.com");
			
			//Select the state/province
			WebElement location = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select personLocation = new Select(location);
			personLocation.selectByVisibleText("New York");
			
			//Click on create leads
			driver.findElement(By.className("smallSubmit")).click();
			
			//Get the title
		    System.out.println("The Title is" + driver.getTitle());
		    
		    if(driver.getTitle().contains("View Lead")) {
		    	System.out.println("I confirm the title as View lead");
		    } else {
		    	System.out.println("The title doesnt have the word View Lead");
		    }
		    
		    //Click on duplicate lead button
		    driver.findElement(By.partialLinkText("Duplicate")).click();
		    
		    //clear company name
		    driver.findElement(By.id("createLeadForm_companyName")).clear();
		    
		    //enter new company name
		    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		    
		    //clear the first name
		    driver.findElement(By.id("createLeadForm_firstName")).clear();
		    
		    //enter new first name
		    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Maddy mad");
		    
		    //Click on create leads
			driver.findElement(By.className("smallSubmit")).click();
			
		//Get the title
		    System.out.println("The Title is" + driver.getTitle());
		    
		    if(driver.getTitle().contains("View Lead")) {
		    	System.out.println("I confirm the title as View lead");
		    } else {
		    	System.out.println("The title doesnt have the word View Lead");
		    }
		    driver.close();
	}
	

}
