package Kenandy.Kenandy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PurchasePlace {
	
	
	static By Fname = By.name("passFirst0");
	static By Lname = By.name("passLast0");
	static By CreditCardNo = By.name("creditnumber");
	static By cc_Fname = By.name("cc_frst_name");
	static By cc_Lname = By.name("cc_last_name");
	static By expMonth = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[3]/select[1]/option[2]");
	static By buyButn = By.name("buyFlights");
	public static void eFname(WebDriver fnam) throws IOException{
		FileInputStream fs = new FileInputStream("/Users/NIS1651m/Documents/phani/Kenandy/InputData.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		fnam.findElement(Fname).sendKeys(prop.getProperty("FirstName"));
		fnam.findElement(Lname).sendKeys(prop.getProperty("LastName"));
		fnam.findElement(CreditCardNo).sendKeys(prop.getProperty("CreditCard"));
		fnam.findElement(expMonth).click();
		Select selExpYear = new Select(fnam.findElement(By.name("cc_exp_dt_yr")));
		selExpYear.selectByValue("2010");
		fnam.findElement(cc_Fname).sendKeys(prop.getProperty("FirstName"));
		fnam.findElement(cc_Lname).sendKeys(prop.getProperty("LastName"));
		
		}
	
	public static void securePurchase(WebDriver sPur){
		sPur.findElement(buyButn).click();
	}
	

}
