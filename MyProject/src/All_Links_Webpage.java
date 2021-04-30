import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class All_Links_Webpage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		
		for (int i=0; i<links.size();i++)
		{
			String Linkname = links.get(i).getText();
			String LinkURL= links.get(i).getAttribute("href");	
					
			System.out.println((i+1) +"."+Linkname+" - "+LinkURL);
		}
		
		System.out.println("Total No.of Links : "+links.size());
		
	    driver.close();
	}

}
