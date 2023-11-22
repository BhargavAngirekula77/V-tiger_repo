package objectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_POM {
	
	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calender;
	
	@FindBy(xpath = "//a[text()='Leads' and  @href='index.php?module=Leads&action=index' ]")
	private WebElement leads;
	
	@FindBy(xpath = "//a[text()='Organizations' and  @href='index.php?module=Accounts&action=index']")
	private WebElement organizations;
	
	@FindBy(xpath = "//a[text()='Contacts' and  @href='index.php?module=Contacts&action=index']")
	private WebElement contacts;
	
	@FindBy(xpath = "//a[text()='Opportunities' and  @href='index.php?module=Potentials&action=index']")
	private WebElement opportunities;
	
	@FindBy(xpath = "//a[text()='Products' and  @href='index.php?module=Products&action=index']")
	private WebElement products;
	
	@FindBy(xpath = "//a[text()='Documents' and  @href='index.php?module=Documents&action=index']")
	private WebElement documents;
	
	@FindBy(xpath = "//a[text()='Email' and  @href='index.php?module=Emails&action=index']")
	private WebElement email;
	
	@FindBy(xpath = "//a[text()='Trouble Tickets' and  @href='index.php?module=HelpDesk&action=index']")
	private WebElement troubleTickets;
	
	@FindBy(xpath = "//a[text()='Dashboard' and  @href='index.php?module=Dashboard&action=index']")
	private WebElement dashboard;
	
	@FindBy(xpath = "//a[text()='More']")
	private WebElement moreDrop_down;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrator;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/mainSettings.PNG']")
	private WebElement settings;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOut;
	 
	public HomePage_POM(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getCalender() {
		return calender;
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrganizations() {
		return organizations;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getOpportunities() {
		return opportunities;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getDocuments() {
		return documents;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getTroubleTickets() {
		return troubleTickets;
	}

	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getMoreDrop_down() {
		return moreDrop_down;
	}

	public WebElement getAdministrator() {
		return administrator;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getSignOut() {
		return signOut;
	}
	
	
	
	public void clickCalender() {
		getCalender().click();
	}
	
	
	public void clickLeads() {
		getLeads().click();
	}
	
	public void clickOrganizations() {
		getOrganizations().click();
	}
	
	public void clickContacts() {
		getContacts().click();
	}
	
	public void clickOpportunities() {
		getOpportunities().click();
	}
	
	public void clickProducts() {
		getProducts().click();
	}
	
	public void clickDocument() {
		getDocuments().click();
	}
	
	public void clickEmail() {
		getEmail().click();
	}
	
	public void clickTroubleTickets() {
		getTroubleTickets().click();
	}
	
	public void clickDashbord() {
		getDashboard().click();
	}
	
	public void clickMoreDrop_Down() {
		getMoreDrop_down().click();
	}
	
	public void clickAdminstartior() {
		getAdministrator().click();
	}
	
	public void clickSetting() {
		getSettings().click();
	}
	

}
