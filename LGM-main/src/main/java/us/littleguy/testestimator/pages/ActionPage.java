package us.littleguy.testestimator.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionPage extends BasePageObject {
	
	private By ChangedToBook = By.xpath("//button[text()='Change to Booked']");
	
	
	
	
	
	

	public ActionPage(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}
	
	public TruckPage ChangeBook()
	{
		click(ChangedToBook);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new TruckPage(driver, log);
	}

}
