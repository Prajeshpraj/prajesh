package Pageobjectmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinp {
        
        WebDriver driver;
        public Signinp(WebDriver driver)
        {
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }
        
        @FindBy(xpath="//button[.='SIGN IN']")
        WebElement sign;
        @FindBy(xpath="//input[@id='username']")
        WebElement username;
        @FindBy(xpath="//input[@id='password']")
        WebElement password;
        @FindBy(xpath="//a[.='Log In']")
        WebElement logbutton;
        
        public void goTo()
        {
            driver.get("https://mobileworld.banyanpro.com/");
            
        }
        public WebElement s()
        {
            return sign;
        }
        public WebElement u()
        {
            return username;
        }
        public  WebElement p()
        {
            return password;
        }
        public WebElement l()
        {
            return logbutton;
        }
		





  }
