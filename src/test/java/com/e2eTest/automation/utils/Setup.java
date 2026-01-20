package com.e2eTest.automation.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Setup {
	private static WebDriver driver;
	private static final Logger LOGGER = (Logger) LogManager.getLogger(Setup.class.getName());

	/** 
	 * Utility class for initializing and managing the {@link WebDriver} 
	 * instance before executing Cucumber scenarios. 
	 *
	 * This class uses the {@code @Before} annotation to automatically 
	 * start a browser before each scenario. The browser is dynamically 
	 * selected based on the system property {@code -Dbrowser}. 
	 *
	 * Supported browsers: 
	 * - chrome (default) 
	 * - firefox 
	 * - edge 
	 * 
	 * If no parameter is provided, Chrome will be used by default. 
	 * 
	 * A logger is also available to track scenario status and driver initialization. 
	 */ 
	
	@Before
	public void setWebDriver(Scenario scenario) {


		LOGGER.info
		("Scenario: " + scenario.getName() + " - Started");
		String browser = System.getProperty("browser"); 
		if (browser == null) {
			browser = "chrome"; 
		} 

		switch (browser) {
		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions(); 
			 chromeOptions.addArguments("--start-maximized");
			 /*
			 *
			 * //chromeOptions.addArguments("--remote-allow-origins=*");
			 * chromeOptions.addArguments("disable-infobars"); // disabling infobars
			 * chromeOptions.addArguments("--disable-extensions"); // disabling extensions
			 * chromeOptions.addArguments("--disable-gpu"); // applicable to windows os only
			 * chromeOptions.addArguments("--disable-dev-shm-usage"); // overcome limited
			 * resource problems chromeOptions.addArguments("--no-sandbox"); // Bypass OS
			 * security model chromeOptions.addArguments("--remote-allow-origins=*");
			 * chromeOptions.addArguments("--disable-logging");
			 * chromeOptions.addArguments("--log-level=3");
			 * chromeOptions.addArguments("--remote-debugging-pipe");
			 */
			// chromeOptions.addArguments("--headless=new");
			
			//chromeOptions.addArguments("force-device-scale-factor=0.75");
			driver = new ChromeDriver(chromeOptions);
			break; 

		case "firefox":
			FirefoxOptions firefoxOptions = new FirefoxOptions(); 
			firefoxOptions.addArguments("--start-maximized"); 
			firefoxOptions.setCapability("platform", Platform.WIN11);
			driver = new FirefoxDriver(firefoxOptions);
			break; 

		case "edge":
			driver = new EdgeDriver(); 

		default: 
			throw new IllegalArgumentException("Browser \"" + browser + "\" is not supported"); 

		}
	}

	/* GETTER */
	public static WebDriver getDriver() {
		return driver; 

	}

	public static Logger getLogger() {
		return LOGGER;

	}

}
