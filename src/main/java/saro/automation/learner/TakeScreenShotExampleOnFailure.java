package saro.automation.learner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import saro.utils.Utils;

public class TakeScreenShotExampleOnFailure {

	public static void main(String[] args) throws Exception{
		Utils utils1 = new Utils();

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {
			// goto url
			driver.get("https://www.zlti.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'Learn More')]")).click();
			//No such element as Home, hence an exception will be thrown
			driver.findElement(By.xpath("//button[contains(text(),'Home')]")).click();
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();

			// Call take screenshot function
			
				utils1.takeSnapShot(driver, "E://selenium//screenshot//takescreenshotexampleOnFailure.jpeg");
		
		}

		driver.quit();

	}

}
