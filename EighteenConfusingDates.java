package com.toscaobstacle;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EighteenConfusingDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/57683/retry");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(By.id("generate")).click();
		
		//Fetch the dynamic date which is generated
		
		String dynamicdate = driver.findElement(By.id("dateGenerated")).getAttribute("value");
		
		// 9/19/2030    MM/dd/yyyy
		//Fetch the month & year
		
		String month = dynamicdate.split("/")[0];
		String year = dynamicdate.split("/")[2];
	
		//Set the LocalDate to new dynamic date which is generated
		LocalDate newbasedate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), 01);
		//Increase the month by 2
		LocalDate finaldate = newbasedate.plusMonths(2);
		
		//Change the format of date as per problem statement req
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		
		//Textbox where the final date needs to be passed
				driver.findElement(By.id("dateSolution")).sendKeys(String.valueOf(finaldate.format(formatter)));
				
				//Click on Done
				driver.findElement(By.id("done")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
