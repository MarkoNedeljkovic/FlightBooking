import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UseBrowser {

	List<WebDriver> drivers;

	public UseBrowser() {
		drivers = new ArrayList<>();
		drivers.add(chrome());
		drivers.add(fireFox());
		drivers.add(iE());
	}

	public WebDriver fireFox() {
		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

	public WebDriver chrome() {
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public WebDriver iE() {
		// System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		return driver;
	}

}
