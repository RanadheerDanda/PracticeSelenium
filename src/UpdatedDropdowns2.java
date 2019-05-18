

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedDropdowns2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\selenium-java-3.141.59\\chromedriver.exe"); 
	  	WebDriver driver =new ChromeDriver();
	  	driver.get("https://www.spicejet.com/");
	  	Select s =new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']")));
	  	s.selectByIndex(2);
	  	Thread.sleep(2000);
	  	s.selectByValue("AED");
	  	Thread.sleep(2000);
	  	s.selectByVisibleText("INR");
	  	Thread.sleep(2000);
		/*
		 * List<WebElement> options=s.getOptions(); for(int i=0;i<options.size();i++) {
		 * System.out.println(options.get(i).getText()); }
		 */
		/*
		 * System.out.println("----------Printing all dropdown values------------");
		 * 
		 * 
		 * WebElement dropdown = driver.findElement(By.xpath(
		 * "//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		 * 
		 * 
		 * List<WebElement> options = dropdown.findElements(By.tagName("option"));
		 * System.out.println(options.size());
		 * 
		 * 
		 * for(int i=0; i<options.size(); i++){
		 * 
		 * 
		 * System.out.println(options.get(i).getAttribute("value"));
		 * 
		 * }
		 */
		
	}

}
