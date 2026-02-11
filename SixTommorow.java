package com.toscaobstacle;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SixTommorow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Browser launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/19875/retry");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Fetch Todays Date
		LocalDate today = LocalDate.now();
		//Increase the day by 1 or tommorows date
		LocalDate tom = today.plusDays(1);
		
		//Change the Date Format as per our req
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		
		//Entering the tommorows date 
		
		driver.findElement(By.id("datefield")).sendKeys(tom.format(formatter));
		
		
		
		
		
		
	}

}
