package com.BancoPlatinum;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class blabla {
	private WebDriver driver;
	
	
	@Before
	public void configura() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.visioncode.cl/");
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
