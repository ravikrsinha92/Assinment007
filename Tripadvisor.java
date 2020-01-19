package assinment_mini;

import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Tripadvisor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("--disable-notification");
		WebDriver driver= new ChromeDriver(chromeOptions);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.tripadvisor.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='brand-global-nav-action-search-Search__label--3PRUD']")).click();
		driver.findElement(By.xpath("//input[@id='mainSearch']")).sendKeys("Club Mahindra");
		Thread.sleep(2000);
		Actions a= new Actions(driver);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();	
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,2500)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='ui_button primary']")).click();
        String winHandleBefore = driver.getWindowHandle();
        driver.switchTo().window(winHandleBefore); 
        
        driver.findElement(By.xpath("//span[@class='ui_bubble_rating fl bubble_50']")).click();
        Thread.sleep(2000);
   //     driver.findElement(By.xpath("//input[@id='ReviewTitle']")).sendKeys("Experience");
 //       JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();	
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,2500)");
   //     js.executeScript("window.scrollBy(0,2000)");
    //    Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='noFraud']")).click();
      
      
		
		
	}

}
