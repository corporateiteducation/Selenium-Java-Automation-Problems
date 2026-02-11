package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeventeenAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/78264/retry");
		driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		int n1 = Integer.parseInt(driver.findElement(By.id("no1")).getText());
		int n2 = Integer.parseInt(driver.findElement(By.id("no2")).getText());
				
		driver.findElement(By.id("result")).sendKeys(String.valueOf(n1+n2));
		
	}

}
