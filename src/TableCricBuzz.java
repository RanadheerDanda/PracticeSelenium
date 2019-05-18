import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCricBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\selenium-java-3.141.59\\chromedriver.exe"); 
	  	WebDriver driver =new ChromeDriver();
	  	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22238/indw-vs-engw-1st-odi-icc-championship-match-england-women-tour-of-india-2019");
	  	WebElement block=driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]"));
	  	int rowCount=block.findElements(By.xpath("div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
	  	List<WebElement> score=block.findElements(By.xpath("div[@class='cb-col cb-col-100 cb-scrd-itms']//div[3]"));
	  	int totalscore=0;
	  	System.out.println("Row Count"+rowCount);
	  	for(int i=0;i<score.size()-2;i++) {
	  		System.out.println(score.get(i).getText());
	  		totalscore=totalscore+Integer.parseInt(score.get(i).getText());	
	  	}
	  	System.out.println("Total Score "+ totalscore);
	  	
	}

}
