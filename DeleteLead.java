package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) {
		
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA' )]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//Click on phone 
		driver.findElement(By.linkText("Phone")).click();
		
		//Clear Area code
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		
		//Enter Area code
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
        //Enter phone number 3
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("6379466330");
	    //Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Capture lead ID of First Resulting lead
		String text1=driver.findElement(By.xpath("//a[text()='11625']")).getText();
		
		System.out.println(text1);
		
		//Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='11625']")).click();
		
		//Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10597");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    
	    //Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		System.out.println("No records to display");
	    //Close the browser (Do not log out)
		driver.close();
	  
	}

}
