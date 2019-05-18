import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  	System.setProperty("webdriver.chrome.driver","H:\\selenium-java-3.141.59\\chromedriver.exe"); 
	  	WebDriver driver =new ChromeDriver();
	  	driver.get("http://echoecho.com/htmlforms10.htm");
	  	WebElement radiobutton =driver.findElement(By.xpath("//input[@type='radio'][@value='Cheese']"));
	  	radiobutton.click();
	  	WebElement CountOfRadiobuttons = driver.findElement(By.xpath("//input[@value='Water']/parent::td"));
	  	List<WebElement> count =CountOfRadiobuttons.findElements(By.tagName("input"));
	  	for(int i=0; i<count.size(); i++){
			
			System.out.println(count.get(i).getAttribute("value"));
			String text=count.get(i).getAttribute("value");
			if(text.equals("Water")) {
				count.get(i).click();
			}
			
		}
	  	System.out.println(count.size());
	  	
	}

}
