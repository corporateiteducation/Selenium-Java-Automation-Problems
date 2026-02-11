package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SevenMeetingScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/41037/retry");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String status = driver.findElement(By.xpath("//table//td[text()='11:00 - 13:00']/parent::tr/td[5]")).getText();
		
		driver.findElement(By.id("resulttext")).sendKeys(status);
	}

}
