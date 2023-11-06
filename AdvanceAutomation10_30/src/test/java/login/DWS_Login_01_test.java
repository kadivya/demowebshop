package login;

//import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import genericUtilities.BaseClass;
//import genericUtilities.ExcelUtility;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_Login_01_test  extends BaseClass{
	@Test(groups="FT")
	public void Login_to_application_with_valid_credentials() {
		loginPage.getLoginlink().click();
		logger.log(Status.INFO,"User click on Login Link");
		loginPage.getEmailTF().sendKeys("kdivya9099@gmail.com");
		logger.log(Status.INFO,"User Entered email address");
		//assertTrue(false);
		loginPage.getPasswordTF().sendKeys("laddu@1435");
		logger.log(Status.INFO,"User Entered Password");
		
		loginPage.getLoginButton().click();
	}
}
