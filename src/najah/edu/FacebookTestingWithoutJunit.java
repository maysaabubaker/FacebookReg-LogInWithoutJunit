package najah.edu;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class FacebookTestingWithoutJunit {
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		driver=new FirefoxDriver();}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	
	@Test
	void test() {
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("maysaabubaker@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("05923115162081997maza");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	}

}
