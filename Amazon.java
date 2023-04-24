package learnings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Amazon {

	public static void main(String[] args) {
	
		//launch browser
		System.setProperty("Webdriver.firefox.driver", 
				"C:\\Users\\Sarathy\\eclipse-workspace\\SelemiumWebdrivers\\drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone11");
		WebElement dropdown = driver.findElement(By.id("twotabsearchtextbox"));
		
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("iphone 11");
		
		WebElement button = driver.findElement(By.id("submit"));
		
		button.click();
		
		driver.close();
		
		
		
		
		
		

		
				
;
		
		
	
		
		

	}

}
