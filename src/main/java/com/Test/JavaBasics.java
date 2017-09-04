package com.Test;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class JavaBasics {
	@Test
	public void Test1() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dheeren\\eclipse-workspace\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
