package com.Ecommerce.Upgrade;

import org.testng.annotations.Test;

import generic_utility.BaseClass_For_VTiger;
import generic_utility.Excel_util;
import objectClass.ContactPage_POM;
import objectClass.CreateContactPage_POM;
import objectClass.HomePage_POM;

public class CreateContact extends BaseClass_For_VTiger {
	@Test
	public void contactScript() throws Exception {
		HomePage_POM hom= new HomePage_POM(driver);
		ContactPage_POM con=new ContactPage_POM(driver);
		CreateContactPage_POM conc= new CreateContactPage_POM(driver);
		Excel_util exc= new Excel_util();
		hom.clickContacts();
		con.clickAddContact();
		String frist=exc.getExcelData("Contacts", 2, 1);
		String Last=exc.getExcelData("Contacts", 2, 2);
		String title= exc.getExcelData("Contacts", 2, 3);
		conc.enterData(frist, Last, title);
		
		
		
	}

}
