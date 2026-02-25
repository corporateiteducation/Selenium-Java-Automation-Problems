package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwentyOneTheLastRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/70310/retry");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		String value = driver.findElement(By.xpath("//tr[last()]//td[2]")).getText();
		
		driver.findElement(By.id("ordervalue")).sendKeys(value);
	}

}
