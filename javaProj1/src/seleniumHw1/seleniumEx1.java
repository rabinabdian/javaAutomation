package seleniumHw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumEx1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * Exercise 3: Should be implemented with Chrome Open
		 * http://www.ebay.com/sch/ebayadvsearch Add ‘tent’ to the ‘Enter keywords or
		 * item number’ text box Add some words to the ‘Exclude words from your search’
		 * text box Checked the ‘Buy It Now’ check box Press the Search button on the
		 * bottom of the page Navigate back Press on the search button on the top of the
		 * page (*can you do it?)
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com/sch/ebayadvsearch");

		/*
		 * Add ‘tent’ to the ‘Enter keywords or item number’ text box Add some words to
		 * the ‘Exclude words from your search’ text box Checked the ‘Buy It Now’ check
		 * box
		 */

		driver.findElement(By.cssSelector("#_nkw")).sendKeys("tent");
		driver.findElement(By.cssSelector("#_ex_kw")).sendKeys("black");
//		Checked the ‘Buy It Now’ check box
//		Press the Search button on the bottom of the page
		driver.findElement(By.cssSelector("#LH_BIN")).click();
		WebElement searchBtn = driver.findElement(By.cssSelector(".btn.btn-prim"));
		searchBtn.click();
//		Press on the search button on the top of the page (*can you do it?)
		driver.navigate().back();
		// driver.findElement(By.cssSelector("#LH_BIN")).click();
		//searchBtn.click();

//////		driver.quit();

	}

}
