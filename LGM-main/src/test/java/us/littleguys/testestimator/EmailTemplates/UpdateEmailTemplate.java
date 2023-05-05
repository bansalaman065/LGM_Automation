package us.littleguys.testestimator.EmailTemplates;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import us.littleguy.testestimator.pages.EmailTemplatesPage;
import us.littleguy.testestimator.pages.LGMJobsPage;
import us.littleguys.testestimator.base.TestUtilities;

public class UpdateEmailTemplate extends TestUtilities {

	@Parameters({ "templateName" })
	@Test(priority = 0)
	public void UpdateEmailTemplate(String templateName)  {
				
		LGMJobsPage jobpage = new LGMJobsPage(driver, log);
		EmailTemplatesPage emailtemplate = jobpage.ClickOnEmailTemplatesOption();
		sleep(20);
		emailtemplate.ClickOnEditIcon();
		sleep(2000);
		emailtemplate.updateEmailTemplate(templateName);
		String message = emailtemplate.getMessage();
		Assert.assertTrue(message.contains("Email Template Updated Successfully"), "Message doesn't contain expected text.");
		sleep(3000);
		emailtemplate.ClickOnBackIcon();
		sleep(2000);
		String firsttemplatenameFromGrid = emailtemplate.gettemplateNameFromFirstRow();
		Assert.assertEquals(firsttemplatenameFromGrid, templateName);

}
}
