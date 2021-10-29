
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking {

	public static void main(String[] args) {
		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		//WebDriver driver = new ChromeDriver();


			
			  UseBrowser browser = new UseBrowser();
			  
			  for (WebDriver driver : browser.drivers) {
			  
			  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			  
			  driver.manage().window().maximize(); WebElement staticDropdown =
			  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			  
			  driver.findElement(By.id("autosuggest")).sendKeys("ind"); sleep(2000L);
			  List<WebElement> options =
			  driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
			  
			  for (WebElement option : options) { if
			  (option.getText().equalsIgnoreCase("India")) { option.click(); break; }
			  
			 }
			 
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			sleep(2000L);
			// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
			driver.findElement(
					By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
					.click();

			driver.findElement(By.id("autosuggest")).click();

			sleep(2000L);

			Select dropdown = new Select(staticDropdown);
			dropdown.selectByIndex(3);

			driver.findElement(By.id("divpaxinfo")).click();

			sleep(2000L);

			for (int i = 1; i < 5; i++) {
				driver.findElement(By.id("hrefIncAdt")).click();
			}

			driver.findElement(By.id("btnclosepaxoption")).click();

			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

			driver.close();

			sleep(2000L);
		}

	}

	public static void execute (WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
	}

	public static void sleep(long x) {
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
