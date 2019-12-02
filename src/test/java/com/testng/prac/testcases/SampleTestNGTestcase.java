package com.testng.prac.testcases;

import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;
import com.testng.prac.base.BaseClass;
import com.testng.prac.pages.TestNGPracClassPage;

public class SampleTestNGTestcase extends BaseClass {
	 TestNGPracClassPage tClassPage;
	
	public SampleTestNGTestcase() {
		super();
	}
	
	@BeforeMethod()
	@Parameters("browser")
	public void initiliazation(String browser) {
		setUp(browser);
		tClassPage = new TestNGPracClassPage();
	}
	
	@Test(priority = 1)
	public void method1()  {
		tClassPage.test1();
	}
	
	@Test(priority=2)
	public void methodN() {
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(tClassPage.getTitles(), "WebDriverUniversity");
		System.out.println("The actual title is " + tClassPage.getTitles());
		assert1.assertAll();
	}
	
	@Test(priority = 3)
	public void method2() {
		tClassPage.test2();
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(tClassPage.getTitles(), "WebDriverUniversity");
		System.out.println("The actual title is " + tClassPage.getTitles());
		assert1.assertAll();
	}
	
	@Test(priority = 4)
	public void method3() {
		tClassPage.test3();
		System.out.println("Please Skip me");
		throw new SkipException("Skipping");
	}
	
	@Test(priority = 5)
	public void method4() {
		tClassPage.test4();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
