package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.TasksPage;
import org.openqa.selenium.WebDriver;

public class ListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.mytinytodo.net/demo/");

		TasksPage tp = new TasksPage(driver);
		tp.addList("Gal1");
		tp.chooseList("Gal1");
		tp.addSimpleTask("Task1");
		tp.addSimpleTask("Task2");
		int num = tp.getNumTasks();
		if (num == 2) {
			System.out.println("Hachla");
		}
	}
}


