package com.toscaobstacle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FivePopUpWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/51130/retry");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Get parent window handle id
		String parentwindowid = driver.getWindowHandle();
		//System.out.println(parentwindowid);
		
		
		//Perform a click on Click Me
		driver.findElement(By.id("button")).click();
		
		//Get all the window IDs
		Set<String> allwindowid = driver.getWindowHandles();
		
		for(String handle:allwindowid)
		{
			if(!handle.equals(parentwindowid))
			{
				driver.switchTo().window(handle);
				driver.close();
				
			}
			
			
		}
		
		
		
		
		
		
	}

}
