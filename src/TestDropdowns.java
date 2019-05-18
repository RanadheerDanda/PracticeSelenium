import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestDropdowns {

	
	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-3.141.59\\chromedriver.exe"); 
	  	WebDriver driver =new ChromeDriver();
		driver.get("http://www.wikipedia.org/");
		
		/*
		 *  English - UK
		 *  English - US
		 * 
		 * 
		 */
		
	//	driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("Eesti");
		
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		//select.selectByVisibleText("Eesti");
		
		select.selectByValue("hi");
		
		List<WebElement> options = select.getOptions();
		
		
		System.out.println(options.size());
		
		
		for(int i=0; i<options.size(); i++){
			
			
			System.out.println(options.get(i).getAttribute("lang"));
			
		}
		
		System.out.println("----------Printing all dropdown values------------");
		
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		
		
		List<WebElement> options1 = dropdown.findElements(By.tagName("option"));
		
		System.out.println(options1.size());
		
		
		for(int i=0; i<options1.size(); i++){
			
			
			System.out.println(options1.get(i).getAttribute("lang"));
			
		}
		
		
		System.out.println("----------Printing all links------------");
		
		
		WebElement block = driver.findElement(By.xpath("//div[@class='footer']"));
		
		
		
		List<WebElement> links = block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		
		for(int i=0; i<links.size(); i++){
			
			
			System.out.println(links.get(i).getAttribute("href"));
			
		}
		
		
		System.out.println("Total links are : "+links.size());
		
		

	}

}
