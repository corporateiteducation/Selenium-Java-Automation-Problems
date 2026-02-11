package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourteenTwoTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/72954/retry");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("a[id*='rnd']")).click();
		driver.findElement(By.cssSelector("a[id*='rnd']")).click();
		
		
	}

}
