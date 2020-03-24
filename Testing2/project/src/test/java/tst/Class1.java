package tst;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

public class Class1 {
	
	WebDriver ChromeDriverObject ;
	@BeforeTest
	public void Opentingbrowser () {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		
	
		ChromeDriverObject = new ChromeDriver();
		ChromeDriverObject.navigate().to("https://www.google.com/");
		ChromeDriverObject.manage().window().maximize();
	}
	@Test (priority = 1)
	public void VerfiyPageTitle(){
			String expectedtitle = "Google";
	        String actualtitle = ChromeDriverObject.getTitle();
	        Assert.assertEquals(actualtitle, expectedtitle);
		}
	@Test (priority = 2)
	public void search(){
			WebElement SearchBox = ChromeDriverObject.findElement(By.name("q"));
			SearchBox.sendKeys("aya");
			SearchBox.sendKeys(Keys.ENTER);
		}
	@AfterTest
	public void closebroser() {
		//ChromeDriverObject.close();
	}
		

}
