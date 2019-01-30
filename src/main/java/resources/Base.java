package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("E:\\Master's Course\\Selenium\\Maven\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(file);
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:/Master's Course/Selenium/Chrome Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "E:/Master's Course/Selenium/IE Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}