package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base{
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@Test
	public void basePageNavigation() throws IOException{
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		log.debug("Visited Url");
		
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		
		LoginPage lpage = new LoginPage(driver);
		lpage.getEmail().sendKeys("username@gmail.com");
		lpage.getPassword().sendKeys("password");
		lpage.getLoginButton().click();
	}
}
