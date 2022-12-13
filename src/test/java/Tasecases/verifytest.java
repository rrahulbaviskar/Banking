package Tasecases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageobjectModel.loginpage;
import Resorcess.Baseclass;

public class verifytest extends Baseclass{
	//public WebDriver driver;
	@Test
	public void login() throws IOException {
		
		 browserlaunch();
		 driver.get("https://demo.guru99.com/V1/index.php");
		 
		
		 loginpage log=new loginpage (driver);
		 log.username().sendKeys("mngr461468");
		 log.password().sendKeys("dUmEded");
		 log.login().click();
	
		 
		
		
	}

}
