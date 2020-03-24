package tst;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Google {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver ChromeBroswerObject = new ChromeDriver();
		ChromeBroswerObject.navigate().to("http://www.google.com");
		ChromeBroswerObject.manage().window().maximize();
		WebElement SearchBox = ChromeBroswerObject.findElement(By.name("q"));
		SearchBox.sendKeys("Selenium");
		SearchBox.sendKeys(Keys.ENTER);
		ChromeBroswerObject.close();

}}	