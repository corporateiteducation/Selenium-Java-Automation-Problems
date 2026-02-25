package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TwentySecondHalfWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/41038/retry");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement btn = driver.findElement(By.id("halfButton"));
		
		//Fetch the actual width
//		int width = btn.getSize().getWidth();
//		Actions act = new Actions(driver);
//		act.moveToElement(btn, (width/3), 0).click().build().perform();
		
		//Shortcut Method
		Actions act = new Actions(driver);
		act.moveToElement(btn, 7, 0).click().build().perform();
		
		
		
		
	}

}
