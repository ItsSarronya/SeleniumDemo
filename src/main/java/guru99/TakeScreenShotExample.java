package guru99;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import saro.utils.Utils;

public class TakeScreenShotExample {

	public static void main(String[] args) throws Exception {

        Utils utils = new Utils();
    	
    	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        //goto url
        driver.get("http://demo.guru99.com/V4/");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        
        //Call take screenshot function
        utils.takeSnapShot(driver, "E://selenium//screenshot//takescreenshotexample.jpeg") ;
        driver.quit();

    }

   
}