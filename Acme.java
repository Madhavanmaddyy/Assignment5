package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acme {
	public static void main(String[] args) {
		//launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("https://acme-test.uipath.com/login");
		//maximize the window
		driver.manage().window().maximize();
		//enter the email id
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		//enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		//click login button
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		//print the title of the page
		System.out.println("the title of the page is  "+driver.getTitle());
		//click logout button
		driver.findElement(By.partialLinkText("Log")).click();
		//close the browser
		driver.close();
		
		
		
		
		
		
		
	}

}
