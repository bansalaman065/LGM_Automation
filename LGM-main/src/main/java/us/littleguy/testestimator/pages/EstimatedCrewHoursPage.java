package us.littleguy.testestimator.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EstimatedCrewHoursPage extends BasePageObject {
	
	private By CrewLeader1 = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/input");
	private By Movers1 = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div/input");
	private By BullPen = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div/div/div[2]/div[1]/div[1]/div[3]/div/input");
	private By JobHours1 = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div/div/div[2]/div[1]/div[5]/div/div/input");
	private By CrewLeader2 = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div/input");
	private By Movers2 = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div/input");
	private By JobHours2=By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div/div/div/div[2]/div[2]/div[5]/div/div/input");

	private By SaveBtn = By.xpath("//button[text()='Save']");
	private By JobBooked = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[1]/h3[2]/span");
	public EstimatedCrewHoursPage(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}
	
	public void SaveInfo() throws Exception
	{
		type("1",CrewLeader1);
		type("1",Movers1);
		type("1",JobHours1);
		Thread.sleep(4000);
		type("1",CrewLeader2);
		type("1",Movers2);
		type("1",JobHours2);
		Thread.sleep(4000);
		click(SaveBtn);
	}
	public String IsJobBooked()
	{
		String s = getText(JobBooked);
		return s;
	}

}
