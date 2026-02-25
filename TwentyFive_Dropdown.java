package com.toscaobstacle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwentyFive_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/14090/retry");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on Generate button
		driver.findElement(By.id("generate")).click();

		
		
		for(int i=1;i<6;i++)
		{
			
			//Fetched the last character from the task
			String taskxpath = "(//td[@class='task'])["+i+"]";
			WebElement task = driver.findElement(By.xpath(taskxpath));
			String strtask = task.getText();
			String lastchar = strtask.substring(strtask.length()-1);
			
			
			//Fetching dropdown
			String valuexpath = "(//td[@class='value']//select)["+i+"]";
			WebElement value = driver.findElement(By.xpath(valuexpath));
			
			//Select Class for dropdown
			Select sel = new Select(value);
			
			//Get all dropdown options
			List<WebElement> optionsdrp = sel.getOptions();
			
			     for(WebElement searchdrp:optionsdrp)
			     {
			    	 if (searchdrp.getText().startsWith(lastchar))
			    	 {
			    		 sel.selectByVisibleText(searchdrp.getText());
			    		 
			    	 }
			    	 
			     }
			
		}
		
		//Click on Submit button
		driver.findElement(By.id("submit")).click();
		
		
	}

}
