import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenWebsite {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupesh R\\Documents\\Softwares\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Selenium");
		search.sendKeys(Keys.ENTER);
				
		//driver.findElement(By.className("gNO89b")).click();
		
		String keyword = driver.findElement(By.name("q")).getAttribute("value");
		System.out.println(keyword);
		
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		//driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		System.out.println("Succesful");
		
		//driver.close();
		driver.quit();		
		

	}

}
