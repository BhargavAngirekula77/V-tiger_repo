package objectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;

public class OrginzationHomePage_POM {
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement addOrganizations;
	
	
	public OrginzationHomePage_POM( WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getAddOrganizations() {
		return addOrganizations;
	}
	
	
	

	public void clickOnAdd() {
		getAddOrganizations().click();
		
	}
	
	

}
