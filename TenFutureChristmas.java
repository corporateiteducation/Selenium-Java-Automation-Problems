package com.toscaobstacle;

import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TenFutureChristmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/21269/retry");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Fetch current year
		
		LocalDate today = LocalDate.now();
		
		//Fetch 2 years in future
		int futureyear = today.plusYears(2).getYear();
		
		//Fetch which day Christmas is falling on
		
		LocalDate christmas = LocalDate.of(futureyear, 12, 25);
		
		String christmasday = christmas.getDayOfWeek().toString();
		
		//Converting Day - first letter as CAPS and remaining in small case
		
		String lcase = christmasday.toLowerCase();
		
		//monday
		
		String finalday = lcase.substring(0, 1).toUpperCase()+lcase.substring(1);
		
		
		//Pass the value in the text box
		
		driver.findElement(By.id("christmasday")).sendKeys(finalday);
		
		
		
		
	}

}
