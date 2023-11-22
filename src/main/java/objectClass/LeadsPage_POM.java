package objectClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadsPage_POM {
	
	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement searchTextField;
	
	@FindBy(xpath = "//div[@id='basicsearchcolumns_real']/select[@name='search_field']")
	private WebElement searchDropDown;
	
	@FindBy(xpath = "//input[@name='submit' ]")
	private WebElement searchButton;
	
	@FindBy(xpath = "//a[text()='Go to Advanced Search']")
	private WebElement advanceSearchLink;
	
	@FindBy(xpath = "//input[@name='selectall']")
	private WebElement selectAllCheckBox;
	
	

}
