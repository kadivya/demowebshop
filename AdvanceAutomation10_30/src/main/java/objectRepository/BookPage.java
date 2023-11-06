package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
	public BookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Books")
	private WebElement book;
	@FindBy(linkText="Fiction")
	private WebElement fictionBook;
	@FindBy(id="add-to-cart-button-45")
	private WebElement fictionBookToCart;
	public WebElement getBook() {
		return book;
	}
	public WebElement getFictionBook() {
		return fictionBook;
	}
	public WebElement getFictionBookToCart() {
		return fictionBookToCart;
	}

}
