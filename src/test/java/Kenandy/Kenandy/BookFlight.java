package Kenandy.Kenandy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BookFlight {
	
	static By selFLight = By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a");
	static By Trip = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]");
	static By preference = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]");
	static By airPref = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option[2]");
	static By cntinue = By.name("findFlights");
	static By cntnue1 = By.name("reserveFlights");
	
	public static void selFlightOption(WebDriver selF){
		selF.findElement(selFLight).click();
	}
	
	public static void selOneWay(WebDriver selTrip){
		selTrip.findElement(Trip).click();
	}
	
	public static void selNoOfPassenger(WebDriver selP){
		Select selNoPass = new Select(selP.findElement(By.name("passCount")));
		selNoPass.selectByValue("1");
	}
	
	public static void selDepartPort(WebDriver selDeprt){
		Select selDprt = new Select(selDeprt.findElement(By.name("fromPort")));
		selDprt.selectByValue("San Francisco");
	}
	
	public static void departDate(WebDriver selDpDate){
		Select selDepDate = new Select(selDpDate.findElement(By.name("fromDay")));
		selDepDate.selectByValue("12");
	}
	
	/*public static void arrvAirprt(WebDriver selArr){
		Select selArrport = new Select(selArr.findElement(By.name("toPort")));
		selArrport.selectByValue("Seattle");
	}*/
	
	public static void selecPref(WebDriver selP){
		selP.findElement(preference).click();
	}
	
	public static void selectAirPref(WebDriver selAirPref){
		selAirPref.findElement(airPref).click();
	}
	
	public static void selCont(WebDriver cont){
		cont.findElement(cntinue).click();
	}
	
	public static void selCont1(WebDriver cont1){
		cont1.findElement(cntnue1).click();
	}
	
	

	
}
