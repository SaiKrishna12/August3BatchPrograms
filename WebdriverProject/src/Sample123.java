import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sample123 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.ap7am.com/telugu-videos-1-all-videos.html");
		WebElement block=driver.findElement(By.xpath("//*[@id='countrydivcontainer']/table"));
		List<WebElement> links=block.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).getText().equals("Tv9 - Sanction Rs 2.25 lakh crore package to AP, CM asks PM"))
			{
				links.get(i).click();
			}
		}
	}

}
