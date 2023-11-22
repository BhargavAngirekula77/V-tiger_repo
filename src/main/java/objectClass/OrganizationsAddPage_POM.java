package objectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsAddPage_POM {
	

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement orgName;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveButton;
	
	public OrganizationsAddPage_POM(WebDriver driver) {
		PageFactory.initElements( driver,this);	}

	
	
	public WebElement getOrgName() {
		return orgName;
	}
	
	
	public WebElement getSaveButton() {
		return saveButton;
	}



	public void clickOnName(String orgnName) {
		getOrgName().sendKeys(orgnName);
	}
	public void clickOnSaveButton() {
		getSaveButton().click();
	}

}
