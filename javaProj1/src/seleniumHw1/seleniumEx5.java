package seleniumHw1;

import javax.print.attribute.standard.PrinterInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.classfile.Annotation.element_value;

public class seleniumEx5 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Exercise 5: Should be implemented with ChromeDriver Open this site
		 * https://login.salesforce.com/ Add user to the user name text box Add password
		 * to the password text box Checked the ‘remember me’ check box Check if the
		 * checkbox is checked, if yes Click the ‘Login’ button (you will get an error
		 * message).
		 * 
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");

		driver.findElement(By.cssSelector("#username")).sendKeys("nipedo1843-tptf@force.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("RABrab26");
		driver.findElement(By.cssSelector("#rememberUn")).click();
		boolean rememberMeIsChecked = driver.findElement(By.cssSelector("#rememberUn")).isSelected();

		if (rememberMeIsChecked) {
			driver.findElement(By.cssSelector("#Login")).click();

		}

	}

	private static void PrinterInfo(WebElement element) {
		// TODO Auto-generated method stub
		String text = element.getText();
		String id = element.getAttribute("id");
		String tag = element.getTagName();
		boolean display = element.isDisplayed();
		boolean enabled = element.isEnabled();

		System.out.println(text + " , " + id + " , " + tag + " , " + display + " , " + enabled);

	}

}
