package day29;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// select specific checkbox
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		// select all checkboxes
		List<WebElement> checkboxesElements = driver.findElements(By.xpath("(//input[@class='form-check-input' and @type='checkbox'])"));
		
//		for(WebElement checkbox:checkboxesElements) {
//			checkbox.click();
//		}
		
		//select last 3 checkboxes
//		for(int i=checkboxesElements.size()-3;i < checkboxesElements.size();i++) {
//			checkboxesElements.get(i).click();
//		}
		
		//select first 3 checkboxes
//		for(int i=0;i<3;i++) {
//			checkboxesElements.get(i).click();
//		}
		
		//un-select all checkbox if selected
		for(WebElement checkbox:checkboxesElements) {
			checkbox.click();
		}
		Thread.sleep(5000);
		
		for(int i=0;i<checkboxesElements.size();i++) {
			if(checkboxesElements.get(i).isSelected()) {
				checkboxesElements.get(i).click();
			}
		}
		
	}

}
