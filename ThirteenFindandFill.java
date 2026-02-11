package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirteenFindandFill {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/73590/retry");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("pass")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("actual")).sendKeys("ABC");
		
		
		driver.findElement(By.id("sample")).click();
		
	}

}
