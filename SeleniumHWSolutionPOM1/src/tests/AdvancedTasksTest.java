package tests;

import pageObjects.AdvTaskPage;
import pageObjects.TasksPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdvancedTasksTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.mytinytodo.net/demo/");

		TasksPage tp = new TasksPage(driver);
		tp.openAdvTask();

		AdvTaskPage atp = new AdvTaskPage(driver);
		atp.fillForm("1", "11/10/20", "MyAdvancedTask1", "MyNote1", "MyTag1");
		tp = new TasksPage(driver);
		tp.openAdvTask();
		atp.fillForm("2", "22/10/20", "MyAdvancedTask2", "MyNote2", "MyTag2");
	}
}


