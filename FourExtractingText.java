package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourExtractingText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/81012/retry");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement alerttext = driver.findElement(By.id("alerttext"));
		WebElement totalamountText = driver.findElement(By.id("totalamountText"));
		
		
		String str = alerttext.getText();
		String amt = str.split("\\$")[1].split(" ")[0];
		
		totalamountText.sendKeys(amt);
		
		
		
	}

}
