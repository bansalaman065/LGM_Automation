package us.littleguy.testestimator.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TruckPage extends BasePageObject {

	private By Ferrigno = By.xpath("//*[@id=\"job-table\"]/tbody/tr[2]/td[21]/span/label/div/span/span/input");
	private By Devito = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div/table/tbody/tr[6]/td[21]/span/label/div/span/span/input");
	private By NextBtn = By.xpath("//button[text()='Next']");
	
	

	public TruckPage(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}

	public PaymentPage TruckDate() throws Exception {
		scrollToRight();
		click(Ferrigno);
		Thread.sleep(3000);
		click(Devito);
		click(NextBtn);
		return new PaymentPage(driver, log);
	}

}
