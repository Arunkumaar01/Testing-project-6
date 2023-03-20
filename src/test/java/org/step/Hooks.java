package org.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks{
	
	public static WebDriver driver;
	
	@Before
	public static void before() {
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/login/");
	}
	
	@After
	public static void after() {
		driver.quit();
	}

}
