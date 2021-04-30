import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableBasic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");

		WebElement element = driver.findElement(By.id("dataTable"));
		List<WebElement> rows = element.findElements(By.tagName("tr"));
		List<WebElement> columns = rows.get(1).findElements(By.tagName("td"));
		
		System.out.println("Rows : "+ rows.size());
		System.out.println("Columns : "+ columns.size());
	    
	    driver.close();
	}

}
