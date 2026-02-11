package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SixteenToDolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/23292/retry");
		driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//tr//td[text()='3']
		
		int i=1;
		while(i<7)
		{
			String xpath = "//tr//td[text()='"+i+"']";
			
			WebElement drag = driver.findElement(By.xpath(xpath));
			WebElement drop = driver.findElement(By.id("completed-tasks"));
			
			
			Actions act = new Actions(driver);
			act.dragAndDrop(drag, drop).build().perform();
			i++;
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
