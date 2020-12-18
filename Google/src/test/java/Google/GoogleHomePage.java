package Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleHomePage {
	
	private WebDriver driver;
	
	@BeforeTest
	public void setUp () {
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleHomePage () {
		
		driver.get("https://www.google.com/");
	}
	
	@AfterTest
	public void tearDown () {
		
		driver.quit();
	}

}
