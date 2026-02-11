package com.toscaobstacle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwelveObvious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/73588/retry");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("clickme")).click();
		
		String randomtext = driver.findElement(By.id("randomtext")).getAttribute("value");
		
		WebElement drpdown = driver.findElement(By.id("selectlink"));
		
		Select sel = new Select(drpdown);
		sel.selectByVisibleText(randomtext);
		
		driver.findElement(By.id("submitanswer")).click();
		
		
	}

}
