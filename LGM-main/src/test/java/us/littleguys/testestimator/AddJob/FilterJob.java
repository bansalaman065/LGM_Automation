package us.littleguys.testestimator.AddJob;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import us.littleguy.testestimator.pages.LGMJobsPage;
import us.littleguys.testestimator.base.TestUtilities;

public class FilterJob extends TestUtilities {

	@Parameters({ "LocationName" ,"JobId"})
	@Test
	public void FilterJob(String LocationName, String JobId) {

		LGMJobsPage jobpage = new LGMJobsPage(driver, log);
		jobpage.ClickOnlocationArrow();
		jobpage.SelectingLocation(LocationName);
		jobpage.ClickOnFilterBy();
		jobpage.SearchByJobId(JobId);
		sleep(5000);
		Assert.assertTrue(jobpage.isJobVisible(JobId), "Job is not available");
	}

}
