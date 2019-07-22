import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-3.141.59\\chromedriver.exe"); 
	  	WebDriver driver =new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("https://www.amazon.com/");
	  	Actions a=new Actions(driver);
	  	WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	  	a.moveToElement(move).build().perform();
	  	Thread.sleep(2000);
	  	//driver.findElement(By.xpath("//a[@id=\"nav_prefetch_yourorders\"]/span")).click();
	  	//or
	  	WebElement orders = driver.findElement(By.xpath("//a[@class=\"nav-link nav-item\"]//span[contains(text(),\"Baby\")]"));
	  	a.moveToElement(orders).click().build().perform();
	  	
	  	/*WebElement SerchBox =driver.findElement(By.id("twotabsearchtextbox"));
	  	a.moveToElement(SerchBox).click().keyDown(SerchBox,Keys.SHIFT).sendKeys(SerchBox,"Hello").keyUp(SerchBox,Keys.SHIFT).sendKeys(SerchBox,"Hello").doubleClick().contextClick().build().perform();
	  	a.moveToElement(move).contextClick().build().perform();*/
		
		//a[@id='nav-link-accountList']
	}

}
