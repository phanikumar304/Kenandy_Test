package Kenandy.Kenandy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountRegister {
	
	
	static By clickreg = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
	
	static By fName = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input");
	static By lastName = By.name("lastName");
	static By phone = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input");
	static By eMail = By.id("userName");
	static By address1 = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input");
	static By address2 = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input");
	static By city = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input");
	static By state = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input");
	static By PostalCode = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input");
	static By uName = By.xpath(".//*[@id='email']");
	static By pwd = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input");
	static By Cpwd = By.name("confirmPassword");
	static By submit = By.name("register");
	
	
	public static void cReg(WebDriver reg ){
		reg.findElement(clickreg).click();
	}
	
	public static void enterTheDet(WebDriver eDet) throws IOException{
		FileInputStream fs = new FileInputStream("/Users/NIS1651m/Documents/phani/Kenandy/InputData.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		eDet.findElement(fName).sendKeys(prop.getProperty("FirstName"));
		eDet.findElement(lastName).sendKeys(prop.getProperty("LastName"));
		eDet.findElement(phone).sendKeys(prop.getProperty("Phone"));
		eDet.findElement(eMail).sendKeys(prop.getProperty("email_create"));
		eDet.findElement(address1).sendKeys(prop.getProperty("Address"));
		eDet.findElement(address2).sendKeys(prop.getProperty("Address2"));
		eDet.findElement(city).sendKeys(prop.getProperty("City"));
		eDet.findElement(state).sendKeys(prop.getProperty("State"));
		eDet.findElement(PostalCode).sendKeys(prop.getProperty("Zipcode"));
		SelectCountry.selcCountry(eDet);
		eDet.findElement(uName).sendKeys(prop.getProperty("UserName"));
		eDet.findElement(pwd).sendKeys(prop.getProperty("password"));
		eDet.findElement(Cpwd).sendKeys(prop.getProperty("Cpassword"));
	}
	
	public static void clickSubmit(WebDriver sub){
		sub.findElement(submit).click();
	}

}
