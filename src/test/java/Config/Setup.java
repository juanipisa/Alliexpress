package Config;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

	public static WebDriver driver;
	
	@Before
	public void setWebDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\juani\\Desktop\\Trabajo\\LuckyApp\\AlliexpressEjercicio\\src\\test\\resources\\Drivers\\chromedriver.exe");
		
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
	}
}
