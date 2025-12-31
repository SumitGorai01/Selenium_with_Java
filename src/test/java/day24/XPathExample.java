package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart");
		
		// X path with single attribute
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T shirts");
		
//		X path with multiple attributes 
//		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirts");
		
//		X path with 'and' & 'or' operator
//		driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tshits");
//		driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Tshts");
		
//		X path with inner text - text()
		driver.findElement(By.xpath("//*[text()='Desktops']")).click();
		
		 String headingString = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(headingString);
	}
}
