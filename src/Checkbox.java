import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\selenium-java-3.141.59\\chromedriver.exe"); 
	  	WebDriver driver =new ChromeDriver();
	  	driver.get("http://qaclickacademy.com/practice.php");
	  	Assert.assertFalse(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
	  	//System.out.println(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
	  	driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
	  	Assert.assertTrue(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
	  	//System.out.println(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
	  	driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
	  	System.out.println(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
	  	WebElement checkboxes =driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]/parent::label/parent::fieldset"));
	  	List<WebElement> countOfCheckboxes =checkboxes.findElements(By.xpath("//input[@type='checkbox']"));
	  	for(int i=0;i<countOfCheckboxes.size();i++) {
	  		Assert.assertEquals(countOfCheckboxes.get(0).getAttribute("id"), "checkBoxOption2");
	  		System.out.println(countOfCheckboxes.get(i).getAttribute("id"));
	  	}
	  	
	  	
	}

}
