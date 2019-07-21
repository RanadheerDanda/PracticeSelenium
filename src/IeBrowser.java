import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "F:\\selenium-java-3.141.59\\MicrosoftWebDriver.exe");
		WebDriver driver =new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}
