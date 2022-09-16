package Pageobjectmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signupp {
	
	WebDriver driver;
	public Signupp(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//button[@type='submit']")
	WebElement signin2;
	
	
	@FindBy(xpath="//a[normalize-space()='Sign up']")
	WebElement signup2;
	
	@FindBy(xpath="//input[@id='myName']")
	WebElement firstname2;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastname2;
	
	@FindBy(xpath="//input[@placeholder='Enter Email']")
	WebElement email2;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password2;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement date2;
	
	@FindBy(xpath="//div[@class='col-md-2']//input[@name='gender']")
	WebElement gender2;
	
	@FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
	WebElement phonenumber2;
	
	@FindBy(xpath="//textarea[@placeholder='Short Bio']")
	WebElement shortbio2;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login2;
	
	 public void goTo2()
	 {
	      driver.get("https://mobileworld.banyanpro.com/"); 
	      
	 }
	 public WebElement s2()
	 {
		 return signin2;
		 
	 }
	 public WebElement u2()
	 
	 {
		 return signup2;
		 
	 }
	 public WebElement f2()
	 {
		 return firstname2;
		 
	 }
	 public WebElement l2()
	 {
		 return lastname2;
		 
	 }
	 public WebElement e2()
	 {
		 return email2;
		  	 
	 }
	 public WebElement p2()
	 {
		 return password2;
		 
	 }
	 public WebElement d2()
	 {
		 return date2;
	 }
	 public WebElement g2()
	 {
		 return gender2;
	 }
	 public WebElement ph2()
	 {
		return phonenumber2;
		 
	 }
	 public WebElement sb2()
	 {
		 return shortbio2;
	 }
     public WebElement li2()
     {
    	 return login2;
     }

}