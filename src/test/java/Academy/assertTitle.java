package Academy;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

public class assertTitle extends Base{
	@Test
	public void basePageNavigation() throws IOException{
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		
		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
	}
}