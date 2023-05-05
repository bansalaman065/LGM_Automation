package us.littleguys.testestimator.AddJob;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import us.littleguys.testestimator.base.CsvDataProviders;
import us.littleguys.testestimator.base.TestUtilities;
import us.littleguy.testestimator.pages.ActionPage;
import us.littleguy.testestimator.pages.AddJobPage;
import us.littleguy.testestimator.pages.DropOffPage;
import us.littleguy.testestimator.pages.EstimatedCrewHoursPage;
import us.littleguy.testestimator.pages.EstimatorLoginPage;
import us.littleguy.testestimator.pages.LGMJobsPage;
import us.littleguy.testestimator.pages.PaymentPage;
import us.littleguy.testestimator.pages.PickUpPage;
import us.littleguy.testestimator.pages.TruckPage;



public class AddJob extends TestUtilities  {
	
	
	@Test(dataProvider = "csvReader" , dataProviderClass= CsvDataProviders.class)
	
	//@Parameters({ "firstname" ,"lastname", "PhoneNo", "email" ,"Address" ,"RoomName" ,"i","item1","item2","point"  ,"DropAddress" ,"Subject","emailA" })
	public void AddJobs(Map<String, String> readdata) throws Exception {
		
		LGMJobsPage jobpage = new LGMJobsPage(driver, log);
		sleep(8000);
		AddJobPage addjob = jobpage.createjob();
		sleep(10000);
	
		// Verifications
		// New page url is expected
		Assert.assertEquals(addjob.getCurrentUrl(), addjob.getPageUrl());
		String firstname = readdata.get("firstname");
		String lastname = readdata.get("lastname");
		String PhoneNo = readdata.get("PhoneNo");
		String altNo = readdata.get("altNo");
		String email = readdata.get("email");
		String altemail = readdata.get("altemail");
		String M = readdata.get("M");
		String orgName = readdata.get("orgName");
		String AssoName = readdata.get("AssoName");
	
		
		addjob.Search(firstname,lastname,PhoneNo,altNo, email,altemail,M,orgName,AssoName);
		sleep(12000);
		addjob.scrollToBottom();
		sleep(3000);
		Assert.assertEquals(addjob.isSavebuttonClickable(),true,"Save button is not enable");
	
		
		int t = driver.findElements(By.xpath("//p[@class='font-italic']")).size();
		if(t > 0) {
           
		System.out.println("Customer not exists");
		sleep(5000);
		Assert.assertTrue(addjob.isNotFoundCustomerMsgDisplayed(), "Customer is available");
		sleep(5000);
		addjob.ClickOnSave();
		sleep(2000);
		
		String message = addjob.getConfirmationMessage();
		// Verification
		Assert.assertTrue(message.contains("Job Info Added Successfully!"), "Message doesn't contain expected text.");
		addjob.ClickOnNext();
		//Verifying pickup form has been opened
		Assert.assertTrue(addjob.isPickupTitleVisible(), "Pickup header not displayed");
		//Pickup details
	
	
		PickUpPage pickup = new PickUpPage(driver, log);
		
		pickup.ClickOnPickUp();
		sleep(2000);
		String Address = readdata.get("Address");
		String RoomName = readdata.get("RoomName");
		pickup.TypeDetails(Address ,RoomName);
		sleep(2500);
		pickup.SelectFromList();
		sleep(20000);
		pickup.ClickAddItem();
		sleep(2000);
		Assert.assertTrue(pickup.IsItemAdded(),"Expected condition is not successfull");
		
		String item1 = readdata.get("item1");
		String item2 = readdata.get("item2");
		
		pickup.WriteItemname(item1,item2);
		pickup.Typeitem();
		pickup.deleteItem();
		sleep(2000);
		pickup.ChoosePacking();
		pickup.ClickReview();
		//String s1=pickup.ClickReview();
		//String s2 = "Standard Pricing ($53.64)";
		//Assert.assertEquals(s1, s2,"Review pricing is incorrect");
		//pickup.ClickReview();
		//DropOff details
		DropOffPage dropOff = new DropOffPage(driver, log);
		dropOff.ClickOnDropOff();
		sleep(2000);
		//dropOff.TypeDropDetails(DropAddress, DropRoomName);
		dropOff.SelectDropList();
		addjob.ClickOnSave();
		sleep(2000);
		
		//After filling details of pick and drop click next
		pickup.clickNextBtn();
		Assert.assertTrue(pickup.IsBasicConfigVisible(),"Expected Condition Unsuccessfull");
		sleep(2000);
		pickup.clickNextBtn();
		Assert.assertTrue(pickup.IsJobStatusVisible(), "Expected Condition Unsuccessfull");
		ActionPage Ap = new ActionPage(driver,log);
		Ap.ChangeBook();
		TruckPage Tp=new TruckPage(driver,log);
		Tp.TruckDate();
		PaymentPage PP = new PaymentPage(driver,log);
		PP.Payment();
		EstimatedCrewHoursPage ECHP = new EstimatedCrewHoursPage(driver,log);
		ECHP.SaveInfo();
		sleep(5000);
		String s = ECHP.IsJobBooked();
		Assert.assertEquals(s,"Booked","Job not booked");
		pickup.clickEmail();
		sleep(2000);
		Assert.assertTrue(pickup.IsEmailHistory(), "Expected Condition Unsuccessfull");
		sleep(2000);
		//pickup.writeEmail(emailA, Subject);
		//sleep(2000);
		pickup.clickSaveBtn();
		String message1 = pickup.IsJobAddedSuccefullAlert();
		// Verification
		Assert.assertTrue(message1.contains("Job Info Added Successfully!"), "Message doesn't contain expected text.");
		
		/*String abcd 
		String actualText = driver.findElement(By.xpath("//p[@class='font-italic']")).getText();
		String expectedText = "Did not find any Customer!";
		String actualText = addjob.SearchedMessage();
		Assert.assert(actualText,expectedText);
		Assert.assertTrue(actualText.contains("Did not find any Customer!"), "Message doesn't contain expected text.");*/
		}
		else {
		    System.out.println("Customer already exists");
		}
		
}
}


