package saro.automation.learner.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LessonsOnWaits {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        String baseUrl = "https://www.zlti.com/";
        driver.get(baseUrl);
        
        //Maximizes the browser window
    	driver.manage().window().maximize() ;
    	
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
        WebElement text1 =driver.findElement(By.xpath("//a/span[contains(text(),'Let�s Talk')]")); 
        System.out.println("Testing implicit wait :: "+text1.getText());
        
        //Explicit Wait
        WebDriverWait wait1=new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/button[@class='btn-arrow btn-home-banner']")));
        System.out.println("Testing expliciy wait :: "+driver.findElement(By.xpath("//a/button[@class='btn-arrow btn-home-banner']")).getText());
       
	}

}
