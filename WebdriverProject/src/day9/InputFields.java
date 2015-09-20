package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InputFields {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		String[] str={"one","two","three","four","five","six","seven","eight"};
		
		List<WebElement> myinput=driver.findElements(By.xpath
		("//input[@type='email' or @type='password' or @type='text']"));
		System.out.println(myinput.size());
		for(int i=0;i<myinput.size();i++)
		{
			myinput.get(i).sendKeys(str[i]);
		}
	}

}
