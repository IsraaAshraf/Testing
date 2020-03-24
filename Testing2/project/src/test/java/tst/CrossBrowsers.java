package tst;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowsers {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver","C:\\IEDriver\\IEDriverServer.exe");
	    System.setProperty("webdriver.gecko.driver","C:\\FirefoxDriver\\geckodriver.exe");
	    
	    
		WebDriver ChromeBrowserObject = new ChromeDriver();
		WebDriver IEBrowserObject = new InternetExplorerDriver();
		WebDriver FireFoxBrowserObject = new FirefoxDriver();
		
		
		ChromeBrowserObject.navigate().to("http://www.google.com");
		ChromeBrowserObject.manage().window().maximize();
		WebElement ChromeSearchBox = ChromeBrowserObject.findElement(By.name("q"));
		ChromeSearchBox.sendKeys("Selenium");
		ChromeSearchBox.sendKeys(Keys.ENTER); 
		
		
		
		IEBrowserObject.navigate().to("http://www.google.com");
		IEBrowserObject.manage().window().maximize();
		WebElement IESearchBox = IEBrowserObject.findElement(By.name("q"));
		IESearchBox.sendKeys("Selenium");
		IESearchBox.sendKeys(Keys.ENTER);
		
		
		
		FireFoxBrowserObject.navigate().to("http://www.google.com");
		FireFoxBrowserObject.manage().window().maximize();
		WebElement FireFoxSearchBox = FireFoxBrowserObject.findElement(By.name("q"));
		FireFoxSearchBox.sendKeys("Selenium");
		FireFoxSearchBox.sendKeys(Keys.ENTER);

	}

}
