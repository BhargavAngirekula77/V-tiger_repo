package objectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage_POM {
	@FindBy (xpath = "//img[@alt='Create Contact...']")
	private WebElement addContact;
	
	
	public ContactPage_POM(WebDriver driver) {
		PageFactory.initElements( driver,this);	
		}


	public WebElement getAddContact() {
		return addContact;
	}
	  public void clickAddContact() {
		  getAddContact().click();
	  }
	

}
