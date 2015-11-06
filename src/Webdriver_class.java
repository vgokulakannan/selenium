import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;	 
	public class Webdriver_class
	{
	   public static void main(String[] args)
	   {
	       WebDriver driver = new FirefoxDriver();
	       driver.get("http://facebook.com");
	       String tagName="";
	      // driver.get(baseUrl);
	      
	       System.out.println(driver.getTitle());
	       driver.close();
	   }
	}
