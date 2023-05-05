package us.littleguys.testestimator.CustomerPageTest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import us.littleguy.testestimator.pages.CustomerPage;
import us.littleguy.testestimator.pages.LGMJobsPage;
import us.littleguys.testestimator.base.TestUtilities;

public class UpdateCustomer extends TestUtilities {

	@Parameters({ "lastname"})
	@Test
	public void UpdateCustomer(String lastname) {
		
		LGMJobsPage jobpage = new LGMJobsPage(driver, log);
		
		CustomerPage customer = jobpage.ClickOnCustomerOption();
		sleep(20);
		//customer.scrollToRight();
		sleep(2000);
		customer.ClickOnEditIcon();
		sleep(2000);
		customer.updateCustomer(lastname);
		String message = customer.getPositiveMessage();
		Assert.assertTrue(message.contains("Customer Data is Updated"), "Message doesn't contain expected text.");
		sleep(3000);
		String firstnameFromGrid = customer.getFirstNameFromFirstRow();
		Assert.assertEquals(firstnameFromGrid, lastname);
	}

}
