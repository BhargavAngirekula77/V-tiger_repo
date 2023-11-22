package objectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage_POM {
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement fristName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@name='title']")
	private WebElement Title;
	
	public CreateContactPage_POM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getFristName() {
		return fristName;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getTitle() {
		return Title;
	}
	
	public void enterData(String Fname,String Lname,String Title) {
		getFristName().sendKeys(Fname);
		getLastname().sendKeys(Lname);
		getTitle().sendKeys(Title);
	}
	
	
	

}
