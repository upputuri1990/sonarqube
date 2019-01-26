package com.sonar.sonar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon {
	
	
	@Test
	public void validateDroDowns() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.manage().window().maximize();
		
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select drop=new Select(dropDown);
		
		List<WebElement> dropDownOptions=drop.getOptions();
		
		for (int i = 0; i < dropDownOptions.size(); i++) {
			
			String text=dropDownOptions.get(i).getText();
			
			if (text.equals("Electronics")) {
				
				Thread.sleep(5000);
				
				drop.selectByIndex(i);
				break;
				
			}
			
		}	
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Calculator");
		
		
		//ssdriver.quit();
		
		
		
		
		
	}

}
