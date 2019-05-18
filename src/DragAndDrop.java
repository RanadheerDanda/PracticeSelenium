import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-3.141.59\\chromedriver.exe"); 
	  	WebDriver driver =new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("https://jqueryui.com/droppable/");
	  	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	  	WebElement s=driver.findElement(By.xpath("//div[@id='draggable']"));
	  	WebElement t=driver.findElement(By.xpath(" //div[@id='droppable']"));
	  	Actions a=new Actions(driver);
	  	a.dragAndDrop(s, t).build().perform();
	  	driver.switchTo().defaultContent();
	  	
		
		//a[@id='nav-link-accountList']
	}

}
