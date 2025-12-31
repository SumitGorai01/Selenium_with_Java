package day21;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * 
 * Test Case :-
 * ------------
 * 
 * 1) Launch browser(chrome)
 * 2) Open url "https://www.opencart.com/" or any url
 * 3) Validate title should be " Your Store "
 * 4) close Browser
 * 
 */

// https://tutorialsninja.com/demo/
// https://naveenautomationlabs.com/opencart

public class FirstTestCase {
	public static void main(String[] args) {
		
		// 1) Launch browser
//		ChromeDriver driver = new ChromeDriver();
		//Or
//		WebDriver driver = new ChromeDriver(); //example of upcasting
		WebDriver driver = new EdgeDriver();
		
		// 2) Open url https://demo.opencart.com
		driver.get("https://www.youtube.com/");
		
		// 3) Validate title should be " Your Store "
		String act_title = driver.getTitle();
		
		if(act_title.equals("YouTube")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		
		// 4) close Browser
		driver.close(); 
//		driver.quit();
		
	}
}
