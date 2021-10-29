import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome2 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("Bezveze text!!!!");
		driver.findElement(By.name("pass")).sendKeys("args");
		driver.findElement(By.id("u_0_c_Sv")).click();
		
		
	}

}
