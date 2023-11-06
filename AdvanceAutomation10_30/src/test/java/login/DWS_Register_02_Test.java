package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_Register_02_Test extends BaseClass {
	@Test
	public void Register_using_credentials() {
		regPage.getRegistrationlink().click();
		logger.log(Status.INFO,"User click on Register Link");
		regPage.getFirstNameTF().sendKeys("Chakri");
		logger.log(Status.INFO,"User Entered First Name");
		regPage.getLastNameTF().sendKeys("AswathaNarayana");
		logger.log(Status.INFO,"User Entered Last Name");
		regPage.getEmailTF().sendKeys("kadivya333@gmail.com");
		logger.log(Status.INFO,"User Entered email address");
		regPage.getPasswordTF().sendKeys("1234567");
		logger.log(Status.INFO,"User Entered Password");
		regPage.getConfirmPasswordTF().sendKeys("1234567");
		logger.log(Status.INFO,"User Confirmed Password");
		regPage.getRegisterButton().click();
		
		
		
}
}