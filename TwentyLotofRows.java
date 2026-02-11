package com.toscaobstacle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwentyLotofRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/41032/retry");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//Find the number of rows
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='rowCountTable']//tr"));
		int noofrows = row.size();
		
		driver.findElement(By.id("rowcount")).sendKeys(String.valueOf(noofrows));
		driver.findElement(By.id("sample")).click();
		
		
		
	}

}
