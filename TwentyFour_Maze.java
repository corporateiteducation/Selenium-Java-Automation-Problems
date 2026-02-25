package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwentyFour_Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/66667/retry");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//Click on Generate Maze
		driver.findElement(By.id("generate")).click();
		
		for(int i=0;i<10;i++)
		{
			String locator = "checkpoint"+i;
			driver.findElement(By.id(locator)).click();
		}
	
		
		
	}

}
