package samplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		//Add Firefox driver executable file in the system properties
				System.setProperty("webdriver.gecko.driver", "D:\\Tarek\\uplift\\Selenium\\Drivers\\geckodriver\\geckodriver.exe");
				
				//Take new object from Firefox Driver
				WebDriver driver = new FirefoxDriver();
			
				//Open google URL from Webdriver
				driver.navigate().to("http://www.google.com");
				
				//Close Driver
				driver.close();
				

	}

}
