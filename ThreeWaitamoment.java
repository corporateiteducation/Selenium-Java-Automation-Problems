package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThreeWaitamoment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Browser Launch
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/33678/retry");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//
		
		WebElement calcbtn = driver.findElement(By.id("one"));
		WebElement sendbtn = driver.findElement(By.id("two"));
		
		//Click on Calculate
		
		calcbtn.click();
		
		//Explicit Wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(sendbtn));
		sendbtn.click();
		
		
		
	}

}
