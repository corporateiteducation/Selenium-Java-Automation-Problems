package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NineteenAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/81121/retry");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		
		while(true)
		{
			
			WebElement btn = driver.findElement(By.id("button"));
			String btnname = btn.getText();
			//System.out.println(btnname);
			
			if(!btnname.equals("ENOUGH"))
			{
				btn.click();
			}
			else
			{
				btn.click();
				break;
				
			}
			
			
		}
		
		
	}

}
