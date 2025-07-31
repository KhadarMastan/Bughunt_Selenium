package org.BugHunter.Khadar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test008_FindElement_StaleElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		WebElement element = driver.findElement(By.xpath("//textarea[@name='q']"));
		try {
			element .sendKeys("khadar",Keys.ENTER);
			Thread.sleep(5000);
			driver.navigate().back();
		} catch (Exception e) 
		{
			element .sendKeys("khadar",Keys.ENTER);
		System.out.println("Exception is-------->  " + e);
		
		}
		driver.close();

	}

}
