package Resorcess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public WebDriver driver;
	public void browserlaunch() throws IOException {
		
		
		FileInputStream fis=new FileInputStream("D:\\Users\\Admin\\eclipse-workspace\\ABCProject\\src\\main\\java\\Resorcess\\data.properties");
		
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		
		
		if(browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromed\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		}else if(browsername.equalsIgnoreCase("firefox")){
				
	
			
			
		}else {System.out.println("No");
		
		
		
		}
		
		
		
	}
	
}
