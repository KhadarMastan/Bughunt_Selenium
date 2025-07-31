package org.BugHunter.Khadar;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test002_Launching_Browser_with_UserInput {

	public static void main(String[] args) {
		
		WebDriver driver = null;			
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Browsername");
		String Browsername = sc.nextLine();
		if(Browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		else if(Browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
		}
		else if(Browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.google.com/");
		}
		else if(Browsername.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
			driver.get("https://www.google.com/");
			driver.get("https://www.google.com/");
		}
		else
		{
			System.out.println("Better luck Next Time don't have such browser in my machine");
		}
		
	}

}
