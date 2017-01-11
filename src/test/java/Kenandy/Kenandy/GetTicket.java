package Kenandy.Kenandy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class GetTicket {
	
	static WebDriver driver = null;
	
	
	public static void main(String[] args) throws IOException{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		String text = driver.getTitle();
		System.out.println(text);
		Assert.assertEquals("Welcome: Mercury Tours", "Welcome: Mercury Tours");
		System.out.println("The page is at Home Page");
		AccountRegister.cReg(driver);
		AccountRegister.enterTheDet(driver);
		AccountRegister.clickSubmit(driver);
		BookFlight.selFlightOption(driver);
		BookFlight.selOneWay(driver);
		BookFlight.selNoOfPassenger(driver);
		BookFlight.selDepartPort(driver);
		BookFlight.departDate(driver);
		BookFlight.selecPref(driver);
		BookFlight.selectAirPref(driver);
		BookFlight.selCont(driver);
		BookFlight.selCont1(driver);
		PurchasePlace.eFname(driver);
		PurchasePlace.securePurchase(driver);
		GetItineryDet.getItDet(driver);
	}
	
	

}
