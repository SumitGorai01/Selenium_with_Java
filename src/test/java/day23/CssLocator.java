package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

//		driver.manage().window().maximize();

//		tag id      -->   tagName#id
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T Shirts");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T Shirts");

//		tag class   -->   tagName.classname
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T Shirts");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T Shirts");

//		tag attribute    -->  tagName[attribute='value']
//		driver.findElement(By.cssSelector("input[placeholder='Search store")).sendKeys("T-shirts");
//		driver.findElement(By.cssSelector("[placeholder='Search store")).sendKeys("T Shirts");

//		tag class attribute   -->   tagName.class[attribute='value']
//		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("T shirt");
		driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("T Shirts");

	}

}
