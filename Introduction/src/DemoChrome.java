import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.google.com/";
		String url2 = "http://www.youtube.com/";
		
		driver.get(url);
		System.out.println(driver.getTitle());
		
		boolean isCorect = url.equalsIgnoreCase(driver.getCurrentUrl());
		System.out.println(isCorect);
		
		driver.get(url2);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
	}

}
