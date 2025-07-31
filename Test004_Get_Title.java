package org.BugHunter.Khadar;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test004_Get_Title {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println("------>Title is "+Title );
		driver.close();
	}

}
