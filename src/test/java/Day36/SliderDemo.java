package Day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		//min slider
		WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Default location of the min slider = "+min_slider.getLocation());
		
		actions.dragAndDropBy(min_slider, 100, 249).perform();
		System.out.println("Location of min slider after sliding : "+min_slider.getLocation());
		
//		//max slider
		WebElement max_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println("Default location of the max slider = "+max_slider.getLocation());
		
		actions.dragAndDropBy(max_slider, -100, 249).perform();
		System.out.println("Location of mx slider after sliding : "+max_slider.getLocation());
		
		
	}
}
