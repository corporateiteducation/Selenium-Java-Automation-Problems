package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElevenRedStripe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Browser Launch
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://obstaclecourse.tricentis.com/Obstacles/30034/retry");
		 
		 //Implicit Wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.findElement(By.id("generate")).click();
		 
		 driver.findElement(By.xpath("//div[@id='number']//following-sibling::div")).click();
		
		
	}

}
