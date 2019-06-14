package saro.automation.learner.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

    
    public static void main(String[] args) throws Exception {
    	
    	WebDriver driver;
    	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launching the Site.		
        driver.get("http://moneyboats.com/");			
     
        //Maximize window		
        driver.manage().window().maximize();		
        		
        //Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");
        
        Thread.sleep(5000);
        
        WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
        
        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", home);
      
        Thread.sleep(5000);
        
        //Vertical scroll down by 1000  pixels		
        js.executeScript("window.scrollBy(0,1000)");
        
        driver.quit();
    }
}