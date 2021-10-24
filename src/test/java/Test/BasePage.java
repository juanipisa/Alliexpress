package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public abstract class BasePage {

		WebDriver driver = new ChromeDriver();
		
	public abstract void validatePage();
}