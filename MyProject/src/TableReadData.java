import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableReadData {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Show More >>")).click();
		

		WebElement table1 = driver.findElement(By.id("dataTable"));
		List<WebElement> rows = table1.findElements(By.tagName("tr"));
		List<WebElement> columns = rows.get(1).findElements(By.tagName("td"));
				
		System.out.println("Rows : "+ rows.size());
		System.out.println("Columns : "+ columns.size());
		
		
		//List<WebElement> heading = rows.get(0).findElements(By.tagName("th"));
		 		
		//for (int h=0;h<heading.size();h++)
		//{
		//	String headline = heading.get(h).getText();
		//	System.out.print ("---"+headline);
		//}
		
		
		for (int i=0; i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.xpath("//th[@id='dataTable'] or //td[@id='dataTable']"));
			
			for(int j=0;j<cols.size();j++) 
			{
			
			String col = cols.get(j).getText();
			System.out.print("---" + col);
		
			}
			
			//System.out.println();
	    }
		
		driver.quit();

}
}

