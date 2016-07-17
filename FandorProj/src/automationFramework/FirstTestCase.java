package automationFramework;

import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.WebDriver;
import org.junit.Assert;


public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://store.demoqa.com");
		
		System.out.println("Successfully opened the website www.Store.Demoqa.com");
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("ONLINE STORE"));

		driver.quit();

	}

}
