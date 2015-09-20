import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Project {
	FirefoxDriver driver;
	@BeforeClass
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://107.209.152.5:8080/ERMRP1.1/view/login/login-init.jsp");
		driver.manage().window().maximize();
	}
	@Test(priority=0)
	public void loginTest()
	{
		driver.findElement(By.id("userName")).sendKeys("mahesh");
		driver.findElement(By.id("ext-comp-1001")).sendKeys("mahesh1");
		driver.findElement(By.id("ext-gen16")).click();
		
	}
	@Test(priority=1)
	public void transitionTest() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(7000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("trimage"))).build().perform();
		
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']"));
		action.click(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		
		Thread.sleep(4000);
		WebElement goToReleaseTransition=driver.findElement(By.id("ext-gen17"));
		js.executeScript("arguments[0].click();",goToReleaseTransition );
		
	}
	

}
