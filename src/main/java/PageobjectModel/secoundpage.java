package PageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class secoundpage {
	public WebDriver driver;
	
	/*By login =By.xpath("//input[@type='submit']");
	
	public WebElement login() {
		return driver.findElement(login);
		
	}*/
	
	By name=By.xpath("//li/a[contains(text(),'New Customer')]");
	By cm=By.xpath("//input[@name='name']");
	By male=By.xpath("(//input[@type='radio'])[1]");
	By date= By.xpath("//input[@name='dob']");
	By ad =By.xpath("//textarea[@name='addr']");
	By city=By.xpath("//input[@name='city']");
	By state=By.xpath("//input[@name='state']");
	By pin=By.xpath("//input[@name='pinno']");
	By tel=By.xpath("//input[@name='telephoneno']");
	By mail=By.xpath("//input[@name='emailid']");
	By submit=By.xpath("//input[@name='sub']");
	
	
	
	public secoundpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement name() {
		return driver.findElement(name);	
		
	}public WebElement cm() {
		return driver.findElement(cm);	

	}

	public WebElement male() {
		return driver.findElement(male);	
		
		
}
	public WebElement date() {
		return driver.findElement(date);	
		
		
}
	public WebElement ad() {
		return driver.findElement(ad);	
		
		
}
	public WebElement city() {
		return driver.findElement(city);	
		
		
}
	public WebElement state() {
		return driver.findElement(state);	
		
		
}
	public WebElement pin() {
		return driver.findElement(pin);	
		
		
}
	public WebElement tel() {
		return driver.findElement(tel);	
		
		
}
	public WebElement mail() {
		return driver.findElement(mail);	
		
		
}
	public WebElement submit() {
		return driver.findElement(submit);	
		
		
}
	
}