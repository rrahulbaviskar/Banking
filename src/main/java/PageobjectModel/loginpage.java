package PageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	public WebDriver driver;
	By username =By.xpath("//input[@name='uid']");
	By password =By.xpath("//input[@name='password']");
	By login =By.xpath("//input[@type='submit']");
	
	
   public loginpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	   this.driver=driver2;
	   
	}

public WebElement username() {
	return driver.findElement(username); 
	   
   }
   
   public WebElement password() {
	   return driver.findElement(password);
	   
   }
	public WebElement login() {
		return driver.findElement(login);
		
	}
	
}
