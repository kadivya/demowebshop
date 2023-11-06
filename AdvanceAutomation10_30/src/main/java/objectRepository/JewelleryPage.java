package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelleryPage{
	public JewelleryPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
		}

		@FindBy(xpath="//a[@href='https://demowebshop.tricentis.com/jewelry?price-0-500']")

		private WebElement FilterPrice0_500;

		public WebElement getFilterPrice0_500 () {

		return FilterPrice0_500;

		}

}
