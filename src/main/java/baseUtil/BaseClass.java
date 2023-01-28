package baseUtil;

import java.net.URL;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

import static utils.Iconstant.*;
import pages.HomePage;
import utils.Configuration;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;
	Configuration config;

	@BeforeMethod
	public void setUp() {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\User\\eclipse-workspace\\com.travelers\\driver\\chromedriver.exe"
		 * );
		 * 
		 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		 * + "/driver/chromedriver.exe");
		 */

		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//driver = new ChromeDriver();

		// System.setProperty("Webdriver.gecko.driver", "./driver/geckodriver.exe");
		// driver = new FirefoxDriver();

		// System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		// driver = new EdgeDriver();

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		config = new Configuration();
		driver.get(config.getProperty((URL)));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.get("https://www.travelers.com/");
		long pageLoadTime = Long.parseLong(config.getProperty(PAGELOAD_WAIT));
		long implicitlyWait = Long.parseLong(config.getProperty(iMPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
		homePage = new HomePage(driver);
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();

	}
}
