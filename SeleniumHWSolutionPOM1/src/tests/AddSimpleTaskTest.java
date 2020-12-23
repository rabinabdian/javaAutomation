package tests;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.TasksPage;
import org.openqa.selenium.WebDriver;

public class AddSimpleTaskTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.mytinytodo.net/demo/");

		TasksPage tp = new TasksPage(driver);
		tp.addSimpleTask("my first task");

	}
}


