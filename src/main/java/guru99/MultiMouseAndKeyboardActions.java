package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/*MultiMouseAndKeyboardActions  :
Using Actions and Action API to club and perform multiple 
keyboard and mouse events*/

public class MultiMouseAndKeyboardActions {

	public static void main(String[] args) throws Throwable {
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver", 
				"E:\\selenium\\chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		WebElement link_Home = driver.findElement(By.linkText("Flights"));
		WebElement td_Home = driver.findElement(By.xpath("//html/body/div" + "/table/tbody/tr/td" + "/table/tbody/tr/td"
				+ "/table/tbody/tr/td" + "/table/tbody/tr[2]"));

		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_Home).build();
		Thread.sleep(10000);
		
		String bgColor = td_Home.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor);
		mouseOverHome.perform();
		Thread.sleep(10000);
		
		bgColor = td_Home.getCssValue("background-color");
		System.out.println("After hover: " + bgColor);
		driver.close();

	}
	


}
