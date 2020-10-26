package com.testng.prac.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriverCommandExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;

	public void setUp(String browser) {
		if (browser.equals("chrome")) {
			System.out.println("Entered Here for test");
			System.setProperty("webdriver.chrome.driver",
					"C:\\KrishnaData\\Selenium\\chromedriver_win3277V\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("http://webdriveruniversity.com/index.html");
		}
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\KrishnaData\\Selenium\\geckodriver-v0.25.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("http://webdriveruniversity.com/index.html");
		}
	}
}
