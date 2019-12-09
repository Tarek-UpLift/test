package samplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	
	public static void main (String[] args) {
		//Add chrome driver executable file in the system properties
		System.setProperty("webdriver.chrome.driver", "D:\\Tarek\\uplift\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		//Take new object from chrome driver
		WebDriver driver = new ChromeDriver();
	
		//Open google url from Webdriver
		driver.navigate().to("http://www.google.com");
		
		//Close Driver
		driver.close();
		
	}
}
