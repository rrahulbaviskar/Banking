package Tasecases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageobjectModel.loginpage;
import PageobjectModel.secoundpage;
import Resorcess.Baseclass;

public class Secoundtest  extends Baseclass {
	@Test
   public void nextpage() throws IOException, InterruptedException {
	   browserlaunch();
		 driver.get("https://demo.guru99.com/V1/index.php");
		 
		 loginpage log=new loginpage (driver);
		 log.username().sendKeys("mngr461468");
		 log.password().sendKeys("dUmEded");
		 log.login().click();
		 
		 
		 
		 secoundpage sec=new secoundpage(driver);
		 sec.name().click();
		 Thread.sleep(5000);
		 
	   	sec.cm().sendKeys("Rahul Baviskar");
		 sec.male().click();
		 sec.date().sendKeys("19121993");
		 sec.ad().sendKeys("At-Ekulti ,Tel-Jamner,Dist-Jalgaon,State-Maharastra");
		 sec.city().sendKeys("pune");
		 sec.state().sendKeys("Maharastra");
		 sec.pin().sendKeys("411057");
		 sec.tel().sendKeys("9511626329");
		 sec.mail().sendKeys("rrahulbaviskar.rb@gmil.com");
		 sec.submit().click();
		// System.out.println(driver.switchTo().alert().getText());
	//	 driver.switchTo().alert().dismiss();
		 
		 
		 
		 
		 
	   
   }
	 
	 
	 
	 
	 
	 
	 

}
