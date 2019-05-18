

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\selenium-java-3.141.59\\chromedriver.exe"); 
	  	WebDriver driver =new ChromeDriver();
	  	driver.get("https://www.spicejet.com/");
	  	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	  	Thread.sleep(2000);
	  	for(int i=1;i<=4;i++)
	  	{
	  		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	  		driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
	  		
	  	}
	  
	  	driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
	  	System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
	  	
	}
}
