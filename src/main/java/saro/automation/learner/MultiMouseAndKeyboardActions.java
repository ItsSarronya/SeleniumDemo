package saro.automation.learner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\selenium\\chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.facebook.com/");
		
		WebElement email_input = driver.findElement(By.id("email"));
		WebElement password_input = driver.findElement(By.id("pass"));
		WebElement logIn = driver.findElement(By.xpath("//input[@value='Log In']"));
				
		String email = "username1";
		String pass = "password1";
		
		Actions builder = new Actions(driver);
		Action actionSeries = builder.moveToElement(email_input).click()
				.sendKeys(email_input,Keys.SHIFT)
				.sendKeys(email_input,email)
				.sendKeys(email_input, Keys.SHIFT).build();
		
		Thread.sleep(5000);
		actionSeries.perform();
		Thread.sleep(5000);
		
		password_input.sendKeys(pass);
		logIn.click();
		
		WebElement relogInPage = driver.
				findElement(By.xpath("//span[contains(text(),'Log in to Facebook')]"));
		
		
		if (relogInPage.isDisplayed()) {
			System.out.println("Incorrect_Password Test - Pass");
		} else {
			System.out.println("Incorrect_Password Test - Fail");
		}
		
		driver.close();

	}

}
