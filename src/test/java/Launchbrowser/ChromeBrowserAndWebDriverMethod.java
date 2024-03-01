package Launchbrowser;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URL; 


public class ChromeBrowserAndWebDriverMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
//System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe\"")
		
WebDriver driver=new ChromeDriver();


//driver.get("https://www.saucedemo.com/");
driver.navigate().to("https://www.saucedemo.com/");
/*URL url =new URL ("https://www.saucedemo.com/");
driver.navigate().to(url);

Thread.sleep(2000);


	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	System.out.println (driver.getCurrentUrl());
	System.out.println (driver.getPageSource());
	System.out.println (driver.getTitle());
	*/
	

	driver.manage().deleteAllCookies();
	
	driver.manage().window().fullscreen(); 
	Thread.sleep(2000);
	driver.manage().window().maximize(); 
	Thread.sleep(2000);
	driver.manage().window().minimize();
	
	
	
	
	
	}

}
