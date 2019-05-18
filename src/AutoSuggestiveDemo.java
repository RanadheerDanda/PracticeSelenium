import javax.print.attribute.standard.Destination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

	  	System.setProperty("webdriver.chrome.driver","H:\\selenium-java-3.141.59\\chromedriver.exe"); 
	  	WebDriver driver =new ChromeDriver();
	  	driver.get("https://www.makemytrip.com/");
	  	WebElement source =driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']"));
	  	source.clear();
	  	source.sendKeys("can");
	  	Thread.sleep(2000);
	  	
	  	for(int i=1;i<=6;i++) {
	  		source.sendKeys(Keys.ARROW_DOWN);
	  	}
	  	source.sendKeys(Keys.ENTER);
	  	/*driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
	  	Thread.sleep(10000);
		WebElement destination =driver.findElement(By.xpath("//input[@id='hp-widget__sTo']]"));
	  	destination.clear();
	  	destination.sendKeys("mum");
	  	Thread.sleep(2000);
	  	for(int i=1;i<=6;i++) {
	  		destination.sendKeys(Keys.ARROW_DOWN);
	  	}
	  	destination.sendKeys(Keys.ENTER);*/
	  	System.out.println(source.getText());
	  	//System.out.println("To"+destination.getText());
	  	
	}

}
