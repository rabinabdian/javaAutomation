package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.TasksPage;


public class AddSimpleTaskTest extends BaseTest {

	@Test
	public void tc01_addSimpleTask() throws InterruptedException {
		TasksPage tp = new TasksPage(driver);
		Thread.sleep(1000);
		int before = tp.getNumTasks();
		tp.addSimpleTask("this is my 1 task");
		tp.addSimpleTask("this is my 2 task");
		Thread.sleep(1000);
		int actual = tp.getNumTasks();
		// should check that we succeed to add 2 tasks
		Assert.assertEquals(actual, before + 2);
	}
}


