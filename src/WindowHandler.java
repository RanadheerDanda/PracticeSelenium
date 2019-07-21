import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-3.141.59\\chromedriver.exe"); 
	  	WebDriver driver =new ChromeDriver();
	  	driver.get("https://accounts.google.com/signup");
	  	System.out.println("Before switching driver title is"+driver.getTitle());
	  	String defaultWindow=driver.getWindowHandle();
	  	System.out.println("Parent window "+defaultWindow);
	  	driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
	  	Set<String> windows=driver.getWindowHandles();
	  	Iterator<String> ids=windows.iterator();
	  	String s=new String();
	  	
	  	while(ids.hasNext()) {
	  		
	  		s=ids.next();
	  		System.out.println(s);
	  		driver.switchTo().window(s);
	  		System.out.println("Driver title is "+ driver.getTitle());
	  		//s=ids.next();
	  		
	  	}
	  	//driver.switchTo().window(s);
	  	//System.out.println(driver.getTitle());
	  	Thread.sleep(10000);	
	  	driver.switchTo().window(defaultWindow);
	  	System.out.println(driver.getTitle());
	}

}
