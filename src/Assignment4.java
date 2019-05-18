import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "H:\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		String s = driver.findElement(By.xpath("//input[@id='checkBoxOption3']/parent::label")).getText();
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		s1.selectByVisibleText(s);
		driver.findElement(By.name("enter-name")).sendKeys(s);
		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();

		if (text.contains(s))

		{

			System.out.println("Alert message success");

		}

		else

			System.out.println("Something wrong with execution");

	}

	// System.out.println(
	// driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());

}