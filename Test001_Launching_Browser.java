package org.BugHunter.Khadar;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test001_Launching_Browser {

	public static void main(String[] args) {
		// TO Download and activate browser driver software
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//To launch the website with given url
		driver.get("https://www.google.com/");
		
			}
}
