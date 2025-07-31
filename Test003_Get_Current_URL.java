package org.BugHunter.Khadar;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test003_Get_Current_URL {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("https"))
		{
			System.out.println("Secured Website");
		}
		else
		{
			System.out.println("Un secured Website");
		}
		driver.close();
	}

}
