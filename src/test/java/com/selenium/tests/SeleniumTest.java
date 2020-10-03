package com.selenium.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class SeleniumTest {

	
	@Test
	public void titleTest() throws Exception{
		WebDriver driver;
		driver = new HtmlUnitDriver();
		
		driver.get("http://54.242.17.177:8080");
		
		String expectedTitle = "CSE Blog";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);
		}
	
	
}
