package Facebook_group.Facebook_group_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/**
 * Hello world!
 *
 */
public class Login 
{
    public static void main( String[] args ) throws InterruptedException {
    	
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");	

WebDriver driver = new ChromeDriver(options);
driver.get("https://www.facebook.com"); 
driver.manage().window().maximize();
WebElement username = driver.findElement(By.id("email"));
username.sendKeys("+966577091873");
WebElement password = driver.findElement(By.id("pass"));
password.sendKeys("Maq@1234");
Thread.sleep(5000); 
WebElement loginbtn = driver.findElement(By.xpath("//button"));
loginbtn.click();
Thread.sleep(3000);
WebElement groups = driver.findElement(By.linkText("Groups"));
groups.click();
Thread.sleep(2000);
WebElement yourfeed = driver.findElement(By.linkText("Your feed"));
yourfeed.click();
WebElement seeallgroups = driver.findElement(By.linkText("See more groups"));
seeallgroups.click();    

}

}

