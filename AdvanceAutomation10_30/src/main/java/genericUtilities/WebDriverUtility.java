package genericUtilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	WebDriver driver;
	 JavascriptExecutor js;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
		 js=(JavascriptExecutor)driver;
	}
	/**
	 * This method	is	used	to	enter	the	data	using	java	script	executor	         
	 * @param element
	 * @param  data	which	has	to	enter	to	the element
	 *
	 */
	public void clickingOnElement(WebElement element) {
		
		js.executeScript("arguments[0].click();", element);
	}

	public void enteringDataIntoElement(WebElement element,String data) {
		js.executeScript("arguments[0].value='"+data+"'",element);
	}
	
	/**
	 * this	method	returns	the	reference	for	web	driver	wait	to achieve	explicit	wait
	 * @param timetowait
	 * @return
	 */
	public  WebDriverWait explicitWaitReference(int	time) {
		WebDriverWait	wait=new	WebDriverWait(driver,Duration.ofSeconds(time));
		return	wait;
	}
	/**
	 * this  method	return	the	actions	class	reference
	 * @return
	 */
	public	Actions	actionsReference() {
		Actions	action=new	Actions(driver);
		return	action;
		
	}
	   public  void  handlingDropdown(WebElement element,String	value)
	   {
		Select	select=new	Select(element);
		try {
			select.selectByVisibleText(value);
			}
		catch(Exception e1) {
			try {
			select.selectByValue(value);
			}
		
		catch(Exception e) {
			select.selectByIndex(Integer.parseInt(value));
		}
		}
	   }
		/**
		 * This method is use to Scrolling the WebPage for given coordinates  
		 * @param x
		 * @param y
		 */
	   
		
		public void scrollToAction(int x,int y) {
			js.executeScript("window.scrollTo("+x+","+y+")");			
		}
		/**
		 * This method is use to Scrolling the WebPage for given coordinates
		 * @param x
		 * @param y
		 */
		public void scrollByAction(int x,int y ) {
			js.executeScript("window.scrollBy("+x+","+y+")");			
		}
		/**
		 * This method is used to Scroll the element for given condition either true or false 
		 * @param element
		 * @param status
		 */
		public void scrollIntoViewAction(WebElement element, Boolean status) {
			js.executeScript("arguments[0].scrollIntoView("+status+")",element);
		}
		//		public WebDriverWait expliciWaitReference(int time) {
		//			WebDriverWait wait=new WebDriverWait(driver, java.time.Duration.ofSeconds(time));
		//			return wait;

		
		/**
		 *  This method is used to switch the driver control from window to name
		 * @param 
		 */
		public void switchingToFrame(String name) {
			driver.switchTo().frame(name);
		}
		/**
		 * This method is used to switch the driver control from window to frame
		 * @param element
		 */
		public void switchingToFrame(WebElement element) {
			driver.switchTo().frame(element);
		}
		/**
		 *  This method is used to switch the driver control from window to element
		 */
		public void switchingBackToMainWindow(){
			driver.switchTo().defaultContent();
		}
		/**
		 * This method is use to return the alert method
		 * @return
		 */
		public Alert returnAlertReference() {
			//driver.switchTo().alert();
			return driver.switchTo().alert();
		}
		/**
		 * This method is used to switch the driver control from one window to anther window
		 * @param allWindowId
		 * @param expectedTitle
		 * @param parentId
		 */
		public void switchingToWindow(Set<String> allWindowId,String expectedTitle,String parentId) {
			allWindowId.remove(parentId);
			for(String id:allWindowId) {
				driver.switchTo().window(id);
				if(expectedTitle.equalsIgnoreCase(driver.getTitle()));
				break;
			}
		}
		/**
		 * This method is used to switch the control back to parent window
		 * @param parentId
		 */
		public void switchingBackToMainWindow(String parentId) {
			driver.switchTo().window(parentId);
		}
	
	private void actionsRefernce() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//old approach
	//	public void clickingOnElementUsingJS(WebDriver driver,WebElement element)
	//	{
	//		JavascriptExecutor js=(JavascriptExecutor)driver;
	//		js.executeScript("arguments[0].click();", element);
	//	}

}
