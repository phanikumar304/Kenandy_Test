package Kenandy.Kenandy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetItineryDet {
	
	static By depDet = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[3]/td/font");
	static By retDet = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[5]/td");
	
	public static void getItDet(WebDriver getDet){
		
		String deptDetails = getDet.findElement(depDet).getText();	
		System.out.println(deptDetails);
		
		String arrDetails = getDet.findElement(retDet).getText();
		System.out.println(arrDetails);
	}
	

}
