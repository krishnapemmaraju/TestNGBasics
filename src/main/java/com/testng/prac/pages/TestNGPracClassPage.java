package com.testng.prac.pages;

import org.openqa.selenium.By;

import com.testng.prac.base.BaseClass;

public class TestNGPracClassPage  extends BaseClass{
	
	public void test1() {
		System.out.println("This is my First Method");
	}
	
	public static String getTitles() {
		return driver.getTitle();
	}
	
	public void test2() {
		System.out.println("This is my second Method");
	}
	
	public void test3() {
		System.out.println("This is my Third Method");
	}
	
	public void test4() {
		System.out.println("This is my Fourth Method");
	}
	

}
