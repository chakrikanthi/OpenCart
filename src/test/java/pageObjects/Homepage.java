package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {
	
   public WebDriver driver;
	
	public Homepage(WebDriver driver)  // constructor for Homepage
	{
		super(driver);
				
	}
	
	//Locators for My Account, Register, Login
	
@FindBy(xpath="//a[@title='My Account']") 
@CacheLookup private WebElement myAccount;

@FindBy(xpath="//a[normalize-space()='Register']") 
@CacheLookup private WebElement register;

@FindBy(xpath="//a[normalize-space()='Login']") //Login link added in Step 5
@CacheLookup private WebElement login;

//Action methods for MyAccount, REGISTER, lOGIN 

public void clickMyAccount()
{
	myAccount.click();
}
public void clickRegister() 
{
	register.click();
	
}
public void clicklogin()//added in step 5
{
	login.click();
}

}
