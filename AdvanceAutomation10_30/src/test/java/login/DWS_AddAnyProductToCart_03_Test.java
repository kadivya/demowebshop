package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_AddAnyProductToCart_03_Test extends BaseClass {
@Test
	public void add_product_to_cart() {
	addProduct.getLaptop().click();
	logger.log (Status.INFO, "User click on laptop link");
	addProduct.getLaptopAddtoCart (); 
	logger.log (Status. INFO, "User  added product to cart");
	addProduct.getShoppingCart ().click();

	}

}
