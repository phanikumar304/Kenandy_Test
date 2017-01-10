package Kenandy.Kenandy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCountry {
	
	public static void selcCountry(WebDriver selc){
		Select selCountry = new Select(selc.findElement(By.name("country")));
		selCountry.selectByValue("215");
	}
	
	

}
