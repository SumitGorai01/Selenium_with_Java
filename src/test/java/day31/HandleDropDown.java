package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement dropElement = driver.findElement(By.xpath("//select[@id='country']"));
		Select dropCountry=new Select(dropElement);
		
		//select option from the drop down
//		dropCountry.selectByVisibleText("France");
//		dropCountry.selectByValue("japan");
//		dropCountry.selectByIndex(2);
		
		
		//capture the options from the dropdown
		List<WebElement> options=dropCountry.getOptions();
		System.out.println("Total Number of options = "+options.size());

		//printing the options
		for(WebElement optionElement : options) {
			System.out.println(optionElement.getText());
		}
		
	}

}
