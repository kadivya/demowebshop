package cart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_AddDesktopToCartAndCompare_05_Test extends BaseClass {
@Test
	public void CompareTwoProduct() {
		addandRemove.getComputer().click();
		logger.log (Status.INFO,"user clicked on computer");
		addandRemove.getDesktop().click();
		logger.log(Status.INFO, "user selected on desktops");
		addandRemove.getAfforadablecomputer().click();
		logger.log(Status.INFO, "user clicked on Afforadable computer");
		addandRemove.getCompareList().click();
		driver.navigate().back();
		logger.log (Status.INFO, "user clicked on back");
		driver.navigate().back();
		logger.log (Status.INFO, "user clicked on back");
		addandRemove.getOwnComputer().click();
		logger.log (Status.INFO, "user clicked on own computer");
		addandRemove.getCompareList().click();
		List<WebElement>remove=driver.findElements(By.xpath("//input[@value='Remove']"));
		int count=remove.size();
		if (count==2) {
		logger.log (Status.PASS, "test case is pass");
		}
		else {
		logger.log (Status.FAIL, "test case is fail");
		}
}
}
