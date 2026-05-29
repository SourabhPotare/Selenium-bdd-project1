package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class loginpage extends BaseClass {
	
	WebDriver driver;
	
	public loginpage(WebDriver driver) {

        this.driver=driver;
	PageFactory.initElements(driver,this);
	
	}
	
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement email;
	
	@FindBy (xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy (xpath="//input[@value='Log In']")
	WebElement loginbutton;
	
	
	
	
	public void enterusername(String user) {
		email.sendKeys("Sourabh@123");		
	}
	public void enterpass(String pass) {
		password.sendKeys("Test@123");
	}
	public void clicklogin() {
		loginbutton.click();
	}

}
