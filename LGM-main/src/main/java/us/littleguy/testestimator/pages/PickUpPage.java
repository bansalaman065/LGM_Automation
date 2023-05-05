package us.littleguy.testestimator.pages;
import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PickUpPage extends BasePageObject {

	
	private By Pickup1 = By.xpath("//li[text()='1. Pickup 1']");
	private By AddressName = By.id("address-name");
	private By PropertyName = By.name("propertyType");
	private By DefaultFloor = By.id("default-floor");
	private By Haselevator = By.className("input-helper");
	private By WalkDistance = By.id("walkDistance");
	private By State = By.name("state");
	private By City = By.name("city");
	private By Miles = By.name("miles");
	private By Roomname= By.id("room-name");
	private By Roomfloor= By.id("room-floor");
	private By Additem = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/div[2]/div[3]/div[3]/div/ul/li[1]/i");
	private By SelectItem1= By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/div[2]/div[3]/div[3]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/div/input");
	private By NextBtn = By.xpath("//button[text()='Next']");
	private By ChooseItem = By.xpath("//h4[text()='Choose Item']");
	private By AddCustomeItem = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/div[2]/div[3]/div[4]/div/ul/li[2]/i");
	private By SelectItem2 = By.xpath("//*[@id=\"mui-46368\"]");
	private By ItemName1 = By.xpath("//tr[2]//td[2]//div[@class='form-group']/input[@placeholder='Item Name']");
	private By AddSpecialItem = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/div[2]/div[3]/div[4]/div/ul/li[3]/i");
	
	private By AddCustomeSpecialItem = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/div[2]/div[3]/div[4]/div/ul/li[4]/i");
	private By AddBox = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/div[2]/div[3]/div[4]/div/ul/li[5]/i");
	private By AddPackingBox = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/div[2]/div[3]/div[4]/div/ul/li[6]/i[1]");
	private By AddNewRoom = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/div[2]/div[3]/div[4]/div/ul/li[7]/i[1]");
	private By DeleteRoom = By.xpath("//li[text() ='2. Room 2']/i");
	private By DeleteBtn = By.xpath("//div[@class='modal-dialog']/div/div[2]/button[2]");
	private By ItemName2 = By.xpath("//tr[4]//td[2]//div[@class='form-group']/input[@placeholder='Item Name']");
	private By Numcrew = By.name("numCrew");
	private By gmail = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div");
	private By SubjectName = By.name("subject");
	private By Perpoint1 = By.xpath("//tr[2]/td[6]/div//input[@placeholder='Per Item']");
	private By Perpoint2 = By.xpath("//tr[4]/td[6]/div//input[@placeholder='Per Item']");
	private By BasicConfig = By.xpath("//span[text()=\"Basic configuration \"]");
	private By JobStatus = By.xpath("//span[text()='Job Status:']");
	private By EmailHistory = By.xpath("//h4[text()='Email History']");
	private By inputhelper = By.xpath("//h3[text()='Related Items Hot Tub/Spa']//following::div/div/div/label/input");
	private By closeBtn = By.xpath("//div[@class='modal-content']/div[2]/button");
	private By SaveBtn = By.xpath("//button[text()='Save']");
	private By Newwindow = By.xpath("//h3[text()='Related Items Armoire']");
	private By JobConfiramtionMsg = By.cssSelector(".Toastify__toast.Toastify__toast--success > div[role='alert']");
	private By relatedItem = By.xpath("//button[text()='Related Item']");
	private By ClickCheckBox = By.xpath("//h3[text()='Related Items Armoire']//following::div/div[1]/div/label/input[@type='checkbox']");
	
	private By Mail = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div[1]/div[4]/div/div/div/div[2]/div[1]");
	private By dialog = By.className("modal-dialog");
	private By Delete1 = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/div[2]/div[3]/div[3]/div/div/div/table/tbody/tr[1]/td[10]/span/button/i");
	private By Delete2 = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/div[2]/div[3]/div[3]/div/div/div/table/tbody/tr[2]/td[10]/span/button/i");
	private By SelectPackaging = By.id("packingMaterialStoreConfigId");
	private By ReviewBtn = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[2]/div/div[3]/button");
	private By Pricing = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[1]/h3[1]");
	private By Clickemail = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[2]/div/div[1]/nav/ul/li[5]/span");
	public PickUpPage(WebDriver driver, Logger log)  {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}
	
	public void ClickOnPickUp()
	{
		click(Pickup1);
	}
	public void TypeDetails(String Address ,String RoomName)
	{
		type(Address , AddressName);
		type(RoomName , Roomname);
		
	}
	
	public void SelectFromList()
	{
		WebElement dropdownElement1 = find(PropertyName);
		Select sel = new Select(dropdownElement1);
		sel.selectByIndex(1);
		WebElement dropdownElement2 = find(DefaultFloor);
		sel = new Select(dropdownElement2);
		sel.selectByIndex(1);
		WebElement dropdownElement3 = find(WalkDistance);
		sel = new Select(dropdownElement3);
		sel.selectByIndex(1);
		WebElement dropdownElement4 = find(State);
		sel = new Select(dropdownElement4);
		sel.selectByIndex(1);
		WebElement ele1 = find(City);
		ele1.sendKeys("Denton");
		pressKeyWithActions(Keys.ARROW_DOWN);
		WebElement dropdownElement6 = find(Roomfloor);
		sel = new Select(dropdownElement6);
		sel.selectByIndex(1);
		
		
		
	}
	public void ClickAddItem() throws Exception
	{
		click(Additem);
		Thread.sleep(5000);
		click(AddCustomeItem);
		Thread.sleep(5000);
		click(AddSpecialItem);
		Thread.sleep(5000);
		click(AddCustomeSpecialItem);
		Thread.sleep(5000);
		click(AddBox);
		Thread.sleep(5000);
		click(AddPackingBox);
		Thread.sleep(5000);
		click(AddNewRoom);
		Thread.sleep(5000);
		//scrollbyVisibleElement(DeleteRoom);
		click(DeleteRoom);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(DeleteBtn);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	public boolean IsItemAdded()
	{
		waitForVisibilityOf(ChooseItem,Duration.ofSeconds(10));
		return find(ChooseItem).isDisplayed();
	}
	
	public void Selectitem() throws Exception
	{
		WebElement ele1 = find(SelectItem1);
		ele1.sendKeys("Armoire");
		pressKeyWithActions(Keys.ARROW_DOWN);
		pressKeyWithActions(Keys.ENTER);
		click(relatedItem);
		switchToActiveElement(dialog);
		//waitForVisibilityOf(dialog ,Duration.ofSeconds(10));
		
		
		Thread.sleep(3000);
		click(ClickCheckBox);
		click(closeBtn);
		WebElement Ele2 = find(SelectItem2);
	    Ele2.sendKeys("Hot");
	    pressKeyWithActions(Keys.ARROW_DOWN);
	    pressKeyWithActions(Keys.ENTER);
	    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //switchToAlert();
	    
	   click(inputhelper);
	   click(closeBtn);
		
	}
	public void deleteItem()
	{
		click(Delete1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(Delete2);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ChoosePacking()
	{
		WebElement dropdownElement = find(SelectPackaging);
		Select sel = new Select(dropdownElement);
		sel.selectByIndex(1);
	}
	

	public void WriteItemname(String s1 , String s2)
	{ //scrollbyVisibleElement(ItemName1);
		type(s1 ,ItemName1);
		type(s2 , ItemName2);
	}
	public void Typeitem()
	{
		type("2" , Perpoint1);
		type("2" , Perpoint2);
	}
	
	public boolean IsBasicConfigVisible()
	{
		waitForVisibilityOf(BasicConfig,Duration.ofSeconds(10));
		return find(BasicConfig).isDisplayed();
	}
	public boolean IsJobStatusVisible()
	{
		waitForVisibilityOf(JobStatus,Duration.ofSeconds(10));
		return find(JobStatus).isDisplayed();
	}
	public boolean IsEmailHistory()
	{
		waitForVisibilityOf(EmailHistory,Duration.ofSeconds(10));
		return find(EmailHistory).isDisplayed();
	}
	public void writeEmail(String Gmail ,String mailSubject)
	{click(gmail);
		type(Gmail , gmail);
		pressKeyWithActions(Keys.ARROW_DOWN);
		pressKeyWithActions(Keys.ENTER);
		click(Mail);
		type (mailSubject ,SubjectName);
	}
	public void clickSaveBtn()
	{
		click(SaveBtn);
	}
	public String IsJobAddedSuccefullAlert()
	{
		waitForVisibilityOf(JobConfiramtionMsg,Duration.ofSeconds(10));
		return driver.findElement(JobConfiramtionMsg).getText();
	}
	public void clickNextBtn()
	{
		click(NextBtn);
	}
	public String ClickReview() throws Exception
	{
		click(ReviewBtn);
		Thread.sleep(4000);
		
		click(ReviewBtn);
		String s = getText(Pricing);
		return s;
	}
	public void clickEmail()
	{
		click(Clickemail);
	}

}
