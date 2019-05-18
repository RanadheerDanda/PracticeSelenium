import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CountOfLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium-java-3.141.59\\chromedriver.exe"); 
	  	WebDriver driver =new ChromeDriver();
	  	driver.get("http://qaclickacademy.com/practice.php");
	  	List<WebElement> links=driver.findElements(By.tagName("a"));
	  	System.out.println("Total links" + links.size());
	  	for(int i=0;i<links.size();i++) {
	  		System.out.println(links.get(i).getAttribute("href"));
	  	}
	  	System.out.println("Footer links are");
	  	//footer links
	  	WebElement block=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
	  	links=block.findElements(By.tagName("a"));
		System.out.println("footer links" + links.size());
	  	for(int i=0;i<links.size();i++) {
	  		System.out.println(links.get(i).getAttribute("href"));
	  	}
	  	//particaular section
	  	WebElement psection=driver.findElement(By.xpath("//div[@id='gf-BIG']//table/tbody/tr/td[1]"));
	  	links=psection.findElements(By.tagName("a"));
		System.out.println("sections links" + links.size());
		
		
	  	for(int i=1;i<links.size();i++) {
	  		String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
	  		System.out.println(links.get(i).getAttribute("href"));
	  		links.get(i).sendKeys(clickOnLink);
	  		
	  	}
	  	Set<String> windows=driver.getWindowHandles();
	  	Iterator<String> it=windows.iterator();
	  	while(it.hasNext()) {
	  		driver.switchTo().window(it.next());
	  		System.out.println(driver.getTitle());
	  	}
	  	
	  	
	  	
	}

}
