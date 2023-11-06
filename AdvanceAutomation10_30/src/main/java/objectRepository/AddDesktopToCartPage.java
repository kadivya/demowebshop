package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDesktopToCartPage {
	public AddDesktopToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Computers")
	private WebElement computer;

	@FindBy(linkText= "Desktops")
	private WebElement desktop;

	@FindBy(linkText="Build your own cheap computer")
	private WebElement afforadablecomputer;

	@FindBy(linkText ="Build your own computer")
	private WebElement ownComputer;

	@FindBy(xpath ="//input[@value='Add to compare list']")
	private WebElement CompareList;

	public WebElement getComputer() {
		return computer;
	}

	public WebElement getDesktop() {
		return desktop;
	}

	public WebElement getAfforadablecomputer() {
		return afforadablecomputer;
	}

	public WebElement getOwnComputer() {
		return ownComputer;
	}

	public WebElement getCompareList() {
		return CompareList;
	}
}


