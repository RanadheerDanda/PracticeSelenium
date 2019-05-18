import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-3.141.59\\chromedriver.exe"); 
	  	WebDriver driver =new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("https://www.amazon.com/");
	  	Actions a=new Actions(driver);
	  	WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	  	a.moveToElement(move).build().perform();
	  	WebElement SerchBox =driver.findElement(By.id("twotabsearchtextbox"));
	  	a.moveToElement(SerchBox).click().keyDown(SerchBox,Keys.SHIFT).sendKeys(SerchBox,"Hello").keyUp(SerchBox,Keys.SHIFT).sendKeys(SerchBox,"Hello").doubleClick().contextClick().build().perform();
	  	a.moveToElement(move).contextClick().build().perform();
		
		//a[@id='nav-link-accountList']
	}

}
