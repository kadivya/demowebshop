package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRandomItemtoCartPage {
	public AddRandomItemtoCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy (linkText = "14.1-inch Laptop")

	private WebElement Laptop;

	@FindBy(id = "add-to-cart-button-31")

	private WebElement LaptopAddtoCart;

	@FindBy (xpath = "//span[text()='Shopping cart']")

	private WebElement ShoppingCart;

	public WebElement getLaptop() {
		return Laptop;
	}

	public WebElement getLaptopAddtoCart() {
		return LaptopAddtoCart;
	}

	public WebElement getShoppingCart() {
		return ShoppingCart;
	}




}


