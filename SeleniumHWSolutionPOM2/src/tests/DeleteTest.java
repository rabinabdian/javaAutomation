package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TasksPage;

public class DeleteTest extends BaseTest {
	

	@Test
	public void tc01_addTask() {
		TasksPage tp = new TasksPage(driver);
		int before = tp.getNumTasks();
		System.out.println("before = " + before);
		tp.addSimpleTask("test7");
		int actual = tp.getNumTasks();
		System.out.println("actual = " + actual);
		// should check that we succeed to add 1 task
		Assert.assertEquals(actual, before + 1);
	}
	
	@Test
	public void tc02_deleteTask() throws InterruptedException {
		TasksPage tp = new TasksPage(driver);
		int before = tp.getNumTasks();
		System.out.println("before = " + before);
		tp.deleteTask("test7");
		Thread.sleep(2000);
		int actual = tp.getNumTasks();
		System.out.println("actual = " + actual);
		// should check that we succeed to delete 1 task
		Assert.assertEquals(actual, before - 1);
	}
	

}
