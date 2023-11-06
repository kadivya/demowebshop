package cart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)

public class DWS_AddDesktopsAndRemove_06_Test extends BaseClass {
	@Test
	public void RemoveCompare(){

		addandRemove.getComputer().click();
		addandRemove.getDesktop().click();
		logger.log (Status. INFO, "user selected on desktops");

		addandRemove.getAfforadablecomputer().click();
		logger.log (Status.INFO, "user clicked on Afforadablecomputer");

		addandRemove.getCompareList().click();
		driver.navigate ().back();
		logger.log (Status. INFO, "user click on back");
		driver.navigate().back(); logger.log (Status.INFO, "user clicked on back");

		addandRemove.getOwnComputer().click();
		logger.log (Status. INFO, "user clicked on own computer");

		addandRemove.getCompareList().click();
		List<WebElement> remove = driver.findElements (By.xpath("//input[@value='Remove']"));
		for (WebElement element:remove) {
		try {
		element.click();
		}
		catch (StaleElementReferenceException e) {
		e.getMessage();
		 }
		}
	}
		
}
