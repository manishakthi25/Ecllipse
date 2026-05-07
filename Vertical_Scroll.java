package learning_JavascriptExecutor_Interface;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vertical_Scroll {
	
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//Type cast the driver into JavasxriptExecutor interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Call the method and execute JS code
		js.executeScript("window.scrollBy(0, 300)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, 150)");
		Thread.sleep(2000);
		
		js.executeAsyncScript("window.scrollBy(0, -200)");
		
	    driver.close();
	}

}
