import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnWindows {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");

		System.out.println(driver.findElements(By.tagName("a")).size());
		List<WebElement> options1 = driver.findElements(By.tagName("a"));
		for (int i = 0; i < options1.size(); i++) {

			System.out.println(options1.get(i).getAttribute("href"));

		}
		String mainWindow = driver.getWindowHandle();

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3-
		//WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> coloumndriver=driver.findElements(By.xpath("//table/tbody/tr/td[1]/ul/li/a"));
		System.out.println(coloumndriver.size());

		// 4- click on each link in the coloumn and check if the pages are opening-
		for (int i = 0; i < coloumndriver.size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			

			//  coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			coloumndriver.get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);

		} // opens all the tabs
		Set<String> abc = driver.getWindowHandles();// 4
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
		driver.switchTo().window(mainWindow);

	}

}
