package saro.automation.learner.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		fruits.selectByIndex(2);

		System.out.println("Printing selected options");
		List<WebElement> fruit_options_selected = fruits.getAllSelectedOptions();
		for (WebElement element : fruit_options_selected)
			System.out.println(element.getText());

		System.out.println("Printing all options");
		List<WebElement> fruit_options_all = fruits.getOptions();
		for (WebElement element : fruit_options_all)
			System.out.println(element.getText());

		System.out.println("Printing de selected options");
		List<WebElement> fruit_options_deselected = new ArrayList<WebElement>();
		for (WebElement element : fruit_options_all) {
			int count = 0;
			for (WebElement e : fruit_options_selected) {
				if (element.getText().equalsIgnoreCase(e.getText())) {
					count++;
				}
			}
			if(count == 0)
				fruit_options_deselected.add(element);
		}
		
		for (WebElement element : fruit_options_deselected)
			System.out.println(element.getText());

	}
}