package Locators_and_WebElement_Methods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;


public class Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.saucedemo.com/");
		
		By un = By.id("user-name"); // Locator by ID
		By pw = By.name("password"); // Locator by Name
		By Loginbtn = By.id("submit-button");// Locator by ClassName
		
		
		  
		
		WebElement un_ele = driver.findElement(un);
		WebElement pw_ele = driver.findElement(pw);
		WebElement Loginbtn_ele = driver.findElement(Loginbtn);
		

	    un_ele.click();
	    un_ele.clear();
	    un_ele.sendKeys("standard_user");
	    Thread.sleep(5000);
	    un_ele.clear();
	    Thread.sleep(5000);
	    un_ele.sendKeys("standard_user");
		
	    String str = un_ele.getAttribute("value");
	    
	
	    System.out.println (str);
	    
	    pw_ele.click();
	    pw_ele.clear();
	    pw_ele.sendKeys("secret_sauce");
	    
	    Thread.sleep(5000);
	    Loginbtn_ele.click();
	    
	
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	
	By links = By.linkText("Create your Amazon account");// Link text
	
	WebElement link_ele = driver.findElement(links);
	link_ele.click();
	
	}

}
