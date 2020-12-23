package pageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TasksPage extends BasePage {

	public TasksPage(WebDriver driver) {
		super(driver);
	}

	public void addSimpleTask(String title) {
		fillText(driver.findElement(By.cssSelector("#task")), title);
	    click(driver.findElement(By.cssSelector("#newtask_submit")));
		sleep(1000);
	}

	public void openAdvTask() {				
		click(driver.findElement(By.cssSelector("#newtask_adv>span")));
		sleep(1000);
	}

	public void search(String text) {				
		fillText(driver.findElement(By.cssSelector("#search")), text);
		sleep(1000);
	}
	
	public void addList(String name) {				
		click(driver.findElement(By.cssSelector(".mtt-tabs-add-button>span")));
		alertOK(name);
		sleep(500);
	}

	public void chooseList(String name) {
		List<WebElement> list = driver.findElements(By.cssSelector("li>a>span"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(name)) {
				click(el);
				break;
			}

		}
	}
	
	//validation
	public int getNumTasks() {
		String s= getText(driver.findElement(By.cssSelector("#total")));
		int num=Integer.parseInt(s);
		return num;
	}

}
