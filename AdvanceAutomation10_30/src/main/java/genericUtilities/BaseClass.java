package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.AddDesktopToCartPage;
import objectRepository.AddRandomItemtoCartPage;
import objectRepository.BookPage;
import objectRepository.JewelleryPage;
import objectRepository.LoginPage;
import objectRepository.RegistrationPage;
import objectRepository.WishlistPage;
/**
 * 
 * 
 * @author DIVYA GOWDA
 *
 */


public class BaseClass implements IAutoConstants{
	/**
	 * BaseClass is used to add Pre & PostConditions
	 * and it is used to create Configuration Annotations and
	 * All the Test Scripts should extends BaseClass
	 */

	public static WebDriver driver;

	public static	TakesScreenshotUtility screenshot;
	public static	WebDriverUtility webdriverUtility;
	public static	JavaUtility javaUtility;
	public static DataBaseUtility dbUtility;
	public static PropertyUtility property;
	public static ExtentTest logger;
	public static LoginPage loginPage;
	public static RegistrationPage regPage;
	public static  AddRandomItemtoCartPage addProduct;
	public static BookPage bookPage;
	public static AddDesktopToCartPage addandRemove;
	public static JewelleryPage jewellerypage;
	public static WishlistPage wishlistpage;
	@BeforeClass(alwaysRun=true)
	public void launchingBrowserAndNavigateToApp() {
		property=new PropertyUtility();


		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(property.getDataFromPropertyFile("url"));

		webdriverUtility=new WebDriverUtility(driver);
		screenshot=new TakesScreenshotUtility(driver);
		dbUtility=new DataBaseUtility();
		javaUtility=new JavaUtility();

	}
	@BeforeMethod(alwaysRun=true)
	public void loginToApplication(){
		loginPage=new LoginPage(driver);
		System.out.println("Logged Into Application");
		regPage=new RegistrationPage(driver);
		addProduct=new  AddRandomItemtoCartPage(driver);
		addandRemove=new AddDesktopToCartPage(driver);
		bookPage=new BookPage(driver);
		jewellerypage=new JewelleryPage(driver);
		wishlistpage=new WishlistPage(driver);
	}
	@AfterMethod(alwaysRun=true)
	public void logoutFromApplication() {
		System.out.println("Logged Out from Application");
	}
	@AfterClass(alwaysRun=true)
	public void teardownTheBrowser() {
		driver.quit();
	}
	}
	//public static TakesScreenshotUtility uti;
	//	
	//	
	//	@BeforeMethod
	//	public static void demo() {
	//	WebDriverManager.chromedriver().setup();
	//	ChromeOptions  options=new ChromeOptions();
	//	options.addArguments("--remote-allow-origins=*");
	//	 driver=new ChromeDriver(options);
	//	 driver.manage().window().maximize();
	//	 uti=new TakesScreenshotUtility(driver);
	//}

