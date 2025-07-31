package org.BugHunter.Khadar;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test007_FindElement_Nosuch_Element_Excep {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		try {
			driver.findElement(By.xpath("//textarea[@name='Khadar']"));
			
		} catch (Exception e) 
		{
		
		System.out.println("Exception is-------->" + e);
		
		}
		driver.close();

	}

}
