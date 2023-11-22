package objectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_out_POM_class {
	
	@FindBy(xpath =  "//input[@name='user_name']")
	private WebElement Username;
	
	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='submitButton']")
	private WebElement login_button;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement person_logo;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement logoutButton;
	
	
	public Login_out_POM_class(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getPerson_logo() {
		return person_logo;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getLogin_button() {
		return login_button;
	}
	
	//business class
	
	public void login_op(String user,String pass) {
		getUsername().sendKeys(user);
		getPassword().sendKeys(pass);
		getLogin_button().click();
		
	}
	public void logout_op() throws Exception {
		getPerson_logo().click();
		Thread.sleep(1000);
		getLogoutButton().click();
	}

}
