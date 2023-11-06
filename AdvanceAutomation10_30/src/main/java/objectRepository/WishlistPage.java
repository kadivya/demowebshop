package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	
		 public WishlistPage (WebDriver driver) {
		 PageFactory.initElements( driver, this);
		}
		@FindBy (name= "removefromcart")
		private WebElement removewishlist;

		@FindBy (name = "updatecart")
		private WebElement updatecart;

		public WebElement getRemovewishlist(){
		return removewishlist;
		}
		public WebElement getUpdatecart() {
		return updatecart;
		}

}
