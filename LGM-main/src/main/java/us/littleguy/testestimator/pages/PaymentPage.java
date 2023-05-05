package us.littleguy.testestimator.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage extends BasePageObject {
	
	private By JobList = By.name("colorList");
	private By Stairs = By.xpath("//button[text()='No Stairs']");

	public PaymentPage(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}
	
	public EstimatedCrewHoursPage Payment() throws Exception
	{
		WebElement dropdownElement1 = find(JobList);
		Select sel = new Select(dropdownElement1);
		sel.selectByIndex(1);
		Thread.sleep(4000);
		click(Stairs);
		return new EstimatedCrewHoursPage(driver, log);
	}
}
