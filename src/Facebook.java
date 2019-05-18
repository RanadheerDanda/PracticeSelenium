import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  	System.setProperty("webdriver.chrome.driver","H:\\selenium-java-3.141.59\\chromedriver.exe"); 
		  	WebDriver driver =new ChromeDriver();
		  	driver.get("http://facebook.com");
		  	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Ranadheerreddy@gmail.com");
		  	//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
		  	//driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']")).click();
		  	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Ranadheerreddy@gmail.com");
		  	driver.findElement(By.cssSelector("input#pass")).sendKeys("password");
		  	
		  	System.out.println();
		  	//driver.close();
		
		
	}

}
