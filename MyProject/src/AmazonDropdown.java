import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("searchDropdownBox"));
			
		Select list=new Select(element);
		
	    list.selectByVisibleText("Electronics");
	    
	    Thread.sleep(2000);
	    
	     List<WebElement> print = list.getOptions();
	     
	     for(int i=0;i<print.size();i++)
	     {
	    	 System.out.println((i+1)+"."+ print.get(i).getText());
	     }
	     
	     System.out.println("Total No.of Elements Found: "+print.size());
	     
	     driver.close();
	}

}
