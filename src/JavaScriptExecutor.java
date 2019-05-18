import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		WebElement from = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		String Sendkeys="Beng";
		from.sendKeys(Sendkeys);
		from.sendKeys(Keys.DOWN);
		from.sendKeys(Keys.DOWN);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		String compare="AIP";
		
		System.out.println(text);
		while (!text.contains(compare)) {

			from.sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);

		}
		from.sendKeys(Keys.ENTER);
		System.out.println(text);
		WebElement to=driver.findElement(By.id("toPlaceName"));
		Sendkeys ="Hyd";
		compare="SHILPA";
		script="return document.getElementById(\"toPlaceName\").value;";
		executeScript(driver, to, Sendkeys, script, compare);
	}

	public static void executeScript(WebDriver d1,WebElement tgt,String SendKey,String script,String comparetext) {
		
		tgt.sendKeys(SendKey);
		tgt.sendKeys(Keys.DOWN);
		//tgt.sendKeys(Keys.DOWN);
		JavascriptExecutor js = (JavascriptExecutor) d1;
		String text = (String) js.executeScript(script);
		System.out.println(text);
		while (!text.contains(comparetext)) {

			tgt.sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);

		}
		tgt.sendKeys(Keys.ENTER);
		
		
	}

}