package seleniumHW3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/index.html");

		// LoginPage
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector(".btn_action")).click();
		Thread.sleep(1000);

		// ProductsPage
		List<WebElement> list1 = driver.findElements(By.cssSelector(".inventory_item_name"));
		for (WebElement el : list1) {
			if (el.getText().equalsIgnoreCase("Sauce Labs Bolt T-Shirt")) {
				el.click();
				break;
			}
		}

		// ProductPage
		driver.findElement(By.cssSelector(".btn_primary.btn_inventory")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".inventory_details_back_button")).click();
		Thread.sleep(1000);

		// ProductsPage
		List<WebElement> list2 = driver.findElements(By.cssSelector(".inventory_item_name"));
		for (WebElement el : list2) {
			if (el.getText().equalsIgnoreCase("Sauce Labs Fleece Jacket")) {
				el.click();
				break;
			}
		}

		// ProductPage
		driver.findElement(By.cssSelector(".btn_primary.btn_inventory")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".inventory_details_back_button")).click();
		Thread.sleep(1000);

		// ProductsPage
		// press the cart button
		driver.findElement(By.cssSelector(".fa-shopping-cart>path")).click();

		// YourCartPage
		// Click on ‘Checkout’ button
		driver.findElement(By.cssSelector(".btn_action.checkout_button")).click();

		// CheckoutYourInformationPage
		// Fill your information and Click ‘checkout’ button.
		driver.findElement(By.cssSelector("#first-name")).sendKeys("Gal");
		driver.findElement(By.cssSelector("#last-name")).sendKeys("Matalon");
		driver.findElement(By.cssSelector("#postal-code")).sendKeys("12345");
		driver.findElement(By.cssSelector(".btn_primary.cart_button")).click();

		// CheckoutOverviewPage
		// Click on ‘Finish’ button
		driver.findElement(By.cssSelector(".btn_action.cart_button")).click();

		// FinishPage
		// Get the message and print it (Thank you message)
		String msg = driver.findElement(By.cssSelector(".complete-header")).getText();
		System.out.println("The message is : " + msg);

	}

}
