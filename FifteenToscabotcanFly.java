package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FifteenToscabotcanFly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/60469/retry");
		driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement drag = driver.findElement(By.id("from"));
		WebElement drop = driver.findElement(By.id("to"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		
		
		
		
	}

}
