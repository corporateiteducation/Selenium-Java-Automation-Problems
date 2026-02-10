package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoTwins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//browser launch
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/12952/retry");
		
		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(By.xpath("(//a[@id='id'])[2]")).click();
		
		
		
	}

}
