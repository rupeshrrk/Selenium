import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(2000);
		
		Select daylist=new Select(driver.findElement(By.id("day")));
		daylist.selectByValue("2");
		
		Select monthlist=new Select(driver.findElement(By.id("month")));
		monthlist.selectByVisibleText("Aug");
		
		Select yearlist=new Select(driver.findElement(By.id("year")));
		yearlist.selectByVisibleText("1987");
		
		
		
		
		
		
		
	}

}
