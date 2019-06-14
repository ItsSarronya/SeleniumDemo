package saro.automation.learner.selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import saro.utils.Utils;

public class KeyboardActions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		Utils utils1 = new Utils();

		// Launching the Site.
		driver.get("http://demo.guru99.com/test/newtours/");
		
		WebElement userName = driver.findElement(By.cssSelector("input[type='text']"));
		WebElement passWord = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement signIn = driver.findElement(By.xpath("//form[@action='index.php']"));
		
		String userNameInput = "Saro";
		String passWordInput = "AutoLearner";
		
		String url1 = driver.getCurrentUrl();
		System.out.println("URL on launch ::"+url1);
		
		//Keyboard Actions Shift + Input text (CAPS)
		userName.sendKeys(Keys.SHIFT+userNameInput);
		userName.sendKeys(Keys.TAB+passWordInput);
		
		System.out.println("Printing userName :: "+userName.getAttribute("value"));
		System.out.println("Printing password :: "+passWord.getAttribute("value"));
		
		//Form submition without using click
		//signIn.submit(); 
		//OR
		passWord.sendKeys(Keys.ENTER);

		//Verify the URL before and after submit is different
		String url2=driver.getCurrentUrl();
		System.out.println("URL after submit ::"+url2);
		assertNotEquals(url1, url2);
		
		WebElement userName1 = driver.findElement(By.xpath("//input[@name='userName']"));
		userName1.sendKeys("Test1");
		
		Actions action = new Actions(driver);
		action.sendKeys(userName1,Keys.chord(Keys.CONTROL,"a"));
		action.sendKeys(userName1,Keys.chord(Keys.CONTROL,"c"));
		
		action.sendKeys(passWord,Keys.chord(Keys.CONTROL,"v"));
		
		System.out.println("Printing userName after keyboard action :: "+userName.getAttribute("value"));
		System.out.println("Printing password after keyboard action :: "+passWord.getAttribute("value"));
		
		
		
	}

}
