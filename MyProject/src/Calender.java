import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {

		String doj="12/August/2021";        
	    String dt,month,year;
	    String[] temp=doj.split("/");
	        
	    dt=temp[0];
	    month=temp[1];
	    year=temp[2];
	        
	    String calyear,calmonth,caldt;

	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
	        
		driver.findElement(By.xpath("//*[@id=\"DepartDate\"]")).click();
		calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
	        
	    while (!calyear.equals(year)) 
	    {
	    	driver.findElement(By.className("nextMonth ")).click();
		calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
	    }
	        
		calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		
	    while (!calmonth.equalsIgnoreCase(month)) 
	    {
	    
		driver.findElement(By.className("nextMonth ")).click();
		calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	    }
	        
	    WebElement calendar;
	    calendar=driver.findElement(By.className("calendar"));
	    List<WebElement> rows;
	    List<WebElement> cols;
	    boolean flg=false;
	    rows=calendar.findElements(By.tagName("tr"));
	    
		for (int i = 1; i < rows.size(); i++) 
	        {
	            cols=rows.get(i).findElements(By.tagName("td"));
	            for (int j = 0; j < cols.size(); j++) 
	            {
	                caldt=cols.get(j).getText();
	                if (caldt.equals(dt)) 
	                {
	                    cols.get(j).click();
	                    flg=true;
	                    break;
	                }
	            }
	            if (flg) 
	            {
	                break;
	            }
	            
	        }
	    
	        
	}

}
