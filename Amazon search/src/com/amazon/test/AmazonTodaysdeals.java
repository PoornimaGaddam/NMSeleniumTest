
package com.amazon.test;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTodaysdeals {
	
public static void main(String[] args) {

	//create firefox browser
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sadhvi\\Documents\\Selenium Simpletest\\geckodriver.exe");
		driver =new FirefoxDriver();
		//WebDriver driver = new FirefoxDriver();
	
	//open Amazon page
	driver.get("https://www.amazon.com/");
		
	//Find Today's deals and click on it
	driver.findElement(By.linkText("Today's Deals")).click();
	
	//From Today's deals page, get deals count message	
	System.out.println(driver.findElement(By.id("FilterItemView_all_summary")).getText());
	
	//Sorting the list
	
	Select drpSort = new Select(driver.findElement(By.name("sortOptions")));
	
	drpSort.selectByValue("BY_PRICE_ASCENDING");
	
	//Verify the image is displayed for product	
	
	boolean ImgPresence = driver.findElement(By.id("dealImage")).isDisplayed();
	
	if (ImgPresence) {
		System.out.println("Product Image is displayed");
	} else {
		System.out.println("Product Image is not displayed");
		
	}
	
	//Verify the Name is displayed for product
	

		driver.findElement(By.id("dealTitle"));
		System.out.println("Product name exist");
		
//Verify the Product price displayed.
	
	driver.findElement(By.className("priceBlock")).isDisplayed();
	System.out.println("Product Price exist");
	
	}
	
}
