package cart;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_AddBookToCart_04_test extends BaseClass
{
	@Test
	public void addBook_To_Cart() {
		bookPage.getBook().click();
		logger.log(Status.INFO,"User clicked on Books Module");
		bookPage.getFictionBook().click();
		logger.log(Status.INFO,"User clicked on Fiction Book");
		bookPage.getFictionBookToCart().click();
		logger.log(Status.INFO,"User Added Fiction Book To Cart");
		
		
	}

}
