package saro.automation.learner.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//how to enter text in an input field without using sendkeys -not working
public class JavaScriptExecutor {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();

		// Launching the Site.
		driver.get("http://demo.guru99.com/");
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;

		// To initialize js object
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		// To enter username
		JS.executeScript("document.getElementsByName('emailid').value='Sarronya'");
		//driver.findElement(By.xpath("//*[@id='lx-searchForm']/form/input[2]")).click();
		// To enter password
		// JS.executeScript("document.getElementById('Pass').value='tester'");
		
	}

}
