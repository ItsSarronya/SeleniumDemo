package saro.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utils {

	/**
	 * 
	 * This function will take screenshot
	 * 
	 * @param webdriver
	 * 
	 * @param fileWithPath
	 * 
	 * @throws Exception
	 * 
	 */

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		File DestFile = new File(fileWithPath);

		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);

	}
	
	public static void inputMultipleKeys(WebDriver webdriver,WebElement element, String keysToBeInput){
		
		String[] keyCodes = keysToBeInput.split("//");
		List<CharSequence> keySequence = new ArrayList<CharSequence>();
		String keyPressed = null;
		
		for(String key : keyCodes){
			if(Keys.valueOf(key) != null){
				keySequence.add(Keys.valueOf(key));
			}
		}
		
		if(keySequence.size() > 0){
			Iterable i = keySequence;
			keyPressed = Keys.chord(i);
			keyPressed = keyPressed+"l";
			new Actions( webdriver ).moveToElement(element).sendKeys(keyPressed).perform();
		}
		
	}

}
