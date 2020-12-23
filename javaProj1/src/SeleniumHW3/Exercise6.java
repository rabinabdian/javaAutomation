package seleniumHW3;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
		// Search for ‘guitar’
		driver.findElement(By.cssSelector("#_nkw")).sendKeys("guitar");
		// Change category to ‘Musical Instruments & Gear’
		Select selectCategory = new Select(driver.findElement(By.cssSelector("#e1-1")));
		selectCategory.selectByValue("619");

		// Update price between 50-60ILS
		driver.findElement(By.cssSelector("#_mPrRngCbx")).click(); // click on checkbox
		driver.findElement(By.cssSelector("[name='_udlo']")).sendKeys("50");
		driver.findElement(By.cssSelector("[name='_udhi']")).sendKeys("60");
		Thread.sleep(1000);

		// Click 'Action' option (Buying formats)
		driver.findElement(By.cssSelector("#LH_Auction")).click();

		// Press the Search button on the bottom of the page
		driver.findElement(By.cssSelector("#searchBtnLowerLnk")).click();
		// wait
		Thread.sleep(2000);

		List<WebElement> list = driver.findElements(By.cssSelector(".lvprice.prc>span"));
		System.out.println("list size is  = " + list.size());
		// Check that all prices are between 50-60
		for (WebElement el : list) {
			String price = el.getText();
			// The format of the price is: ILS 49.50, so we need to remove the ILS before
			// converting it from String to double
			price = price.replace("ILS ", "");
			//System.out.println(price);
			double dPrice = Double.parseDouble(price);
			if (!(dPrice > 50.0 && dPrice < 60.0)) {
				System.out.println("Wrong price: " + dPrice);
			}
		}

	}

}
